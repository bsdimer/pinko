import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { environment } from "../../environments/environment";
import { ContactEntry } from "../model/contact-entry";
import { AppService } from "./app.service";
import { Observable, throwError } from "rxjs";
import { catchError } from "rxjs/internal/operators";
import { HttpErrorResponse } from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ContactEntryService {

  constructor(private http: HttpClient, private appService: AppService) {
  }

  public findAll() {
    return this.http.get(environment.mainApiPrefix + "/contact")
      .pipe(
        catchError(this.handleError)
      )
  }

  public save(contactEntry: ContactEntry): Observable<ContactEntry> {
    contactEntry.displayName = contactEntry.givenName +  contactEntry.sn + contactEntry.telephoneNumber + contactEntry.mobile;
    return this.http.post<ContactEntry>(environment.mainApiPrefix + "/contact", contactEntry)
      .pipe(
        catchError(this.handleError)
      );
  }

  public delete(dn: string) {
    return this.http.delete(environment.mainApiPrefix + "/contact?dn=" + dn)
      .pipe(
        catchError(this.handleError)
      )
  }


  private handleError(error: HttpErrorResponse) {
    this.appService.loading = false;
    if (error.error instanceof ErrorEvent) {
      console.error('An error occurred:', error.error.message);
    } else {
      console.error(
        `Backend returned code ${error.status}, ` +
        `body was: ${error.error}`);
    }
    return throwError(
      'Something bad happened; please try again later.');
  };
}
