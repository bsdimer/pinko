import { Component, OnInit } from '@angular/core';
import { ContactEntry } from "../../model/contact-entry";
import { Table } from "primeng/table"
import { ContactEntryService } from "../../services/contact-entry.service";
import { AppService } from "../../services/app.service";

@Component({
  selector: 'app-contact-management',
  templateUrl: './contact-management.component.html',
  styleUrls: ['./contact-management.component.scss']
})
export class ContactManagementComponent implements OnInit {

  contacts: ContactEntry[];
  selectedContact: ContactEntry = new ContactEntry();
  showCreateDialog: boolean;
  cols: any[];

  constructor(private contactEntryService: ContactEntryService, private appService:AppService) {
  }

  ngOnInit() {
    this.cols = [
      {field: 'givenName', header: 'givenName'},
      {field: 'middleName', header: 'middleName'},
      {field: 'sn', header: 'sn'},
      {field: 'telephoneNumber', header: 'telephoneNumber'},
      {field: 'mobile', header: 'mobile'},
      {field: 'mail', header: 'mail'}
    ];

    this.load();
  }

  private moreInfo(row: any) {
    this.selectedContact = row;
    this.showCreateDialog = true;
  }

  private load() {
    this.appService.loading = true;
    this.contactEntryService.findAll().subscribe((result: ContactEntry[]) => {
      this.contacts = result;
      this.appService.loading = false;
    })
  }

  private delete() {
    this.appService.loading = true;
    this.contactEntryService.delete(this.selectedContact.dn).subscribe(()=> {
      this.showCreateDialog = false;
      this.selectedContact = new ContactEntry();
      this.appService.loading = false;
      this.load()
    });
  }

  private save() {
    this.contactEntryService.save(this.selectedContact).subscribe(entry => {
      this.selectedContact = entry;
      this.showCreateDialog = false;
      this.load();
    })
  }

  private create() {
    this.selectedContact = new ContactEntry();
    this.showCreateDialog = true;
  }

}
