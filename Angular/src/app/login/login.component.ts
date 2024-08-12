import { Component } from '@angular/core';
import {FormControl, Validators} from "@angular/forms";

class MyErrorStateMatcher {
  isErrorState(control: FormControl | null): boolean {
    const isSubmitted = false;
    return !!(control && control.invalid && (control.dirty || control.touched || isSubmitted));
  }
}

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  emailFormControl = new FormControl('', [
    Validators.required,
    Validators.email,
  ]);

  matcher = new MyErrorStateMatcher();
}
