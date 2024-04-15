import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DashboardComponent } from './dashboard/dashboard.component';
import { SaveprojectComponent } from './saveproject/saveproject.component';
import { AddprojectComponent } from './addproject/addproject.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';



@NgModule({
  declarations: [
    DashboardComponent,
    SaveprojectComponent,
    AddprojectComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    HttpClientModule
  ],
  exports:[
    DashboardComponent,
    SaveprojectComponent,
    AddprojectComponent
  ]
})
export class ProjectModule { }
