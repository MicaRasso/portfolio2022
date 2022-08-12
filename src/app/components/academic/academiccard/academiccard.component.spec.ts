import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AcademiccardComponent } from './academiccard.component';

describe('AcademiccardComponent', () => {
  let component: AcademiccardComponent;
  let fixture: ComponentFixture<AcademiccardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AcademiccardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AcademiccardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
