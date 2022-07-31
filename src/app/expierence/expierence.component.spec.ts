import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExpierenceComponent } from './expierence.component';

describe('ExpierenceComponent', () => {
  let component: ExpierenceComponent;
  let fixture: ComponentFixture<ExpierenceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExpierenceComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExpierenceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
