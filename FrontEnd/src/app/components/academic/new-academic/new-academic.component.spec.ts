import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewAcademicComponent } from './new-academic.component';

describe('NewAcademicComponent', () => {
  let component: NewAcademicComponent;
  let fixture: ComponentFixture<NewAcademicComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewAcademicComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NewAcademicComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
