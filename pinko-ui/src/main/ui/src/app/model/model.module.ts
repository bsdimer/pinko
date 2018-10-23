import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ContactEntry } from "./contact-entry";
import { ContactEntryService } from "../services/contact-entry.service";
import { FormsModule } from "@angular/forms";

@NgModule({
  imports: [
    CommonModule,
    FormsModule
  ],
  exports: [],
  providers: [],
  declarations: []
})
export class ModelModule {
}
