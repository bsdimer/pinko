import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ContactManagementComponent } from './view/contact-management/contact-management.component';
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { ModelModule } from "./model/model.module";
import { HttpClientModule } from "@angular/common/http";
import { TableModule } from "primeng/components/table/table";
import { ButtonModule } from "primeng/components/button/button";
import { Angular2FontawesomeModule } from "angular2-fontawesome";
import { DataTableModule } from "primeng/components/datatable/datatable";
import { ProgressSpinnerModule } from "primeng/components/progressspinner/progressspinner";
import { DialogModule } from "primeng/components/dialog/dialog";
import { FormsModule } from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    ContactManagementComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ModelModule,
    TableModule,
    ButtonModule,
    Angular2FontawesomeModule,
    ProgressSpinnerModule,
    DialogModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
