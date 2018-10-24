import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ContactManagementComponent } from "./view/contact-management/contact-management.component";

const routes: Routes = [
  { path: 'contacts', component: ContactManagementComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
