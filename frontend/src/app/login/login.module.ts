import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginuserComponent } from './loginuser/loginuser.component';
import { RegisteruserComponent } from './registeruser/registeruser.component';
import { FormsModule } from '@angular/forms';
import { ProjectModule } from '../project/project.module';


@NgModule({
  declarations: [
    LoginuserComponent,
    RegisteruserComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    ProjectModule
  ],
  exports:[
    LoginuserComponent,
    RegisteruserComponent
  ]
})
export class LoginModule { }
