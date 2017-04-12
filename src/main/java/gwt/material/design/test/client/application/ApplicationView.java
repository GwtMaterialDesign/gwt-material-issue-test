/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.test.client.application;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.sideprofile.MaterialSideProfile;
import gwt.material.design.client.ui.MaterialHeader;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialSideNav;
import gwt.material.design.client.ui.animate.MaterialAnimation;
import gwt.material.design.client.ui.animate.Transition;

import javax.inject.Inject;

public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {
    interface Binder extends UiBinder<Widget, ApplicationView> {
    }

    @UiField
    MaterialSideNav sideNav;

    @UiField
    MaterialHeader header;

    @UiField
    MaterialSideProfile sideProfile;

    @UiField
    MaterialPanel namePanel;

    @UiField
    MaterialImage image;

    @Inject
    ApplicationView(
            Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

       /* sideNav.addOpeningHandler(event -> {
            new MaterialAnimation().duration(400).transition(Transition.FADEINDOWN).animate(namePanel);
            image.setWidth("60px");
            image.setHeight("60px");
            sideProfile.setHeight("160px");
            GWT.log("Opening");
        });
        sideNav.addClosingHandler(event -> {
            new MaterialAnimation().duration(400).transition(Transition.FADEOUTUP).animate(namePanel);
            image.setWidth("32px");
            image.setHeight("32px");
            sideProfile.setHeight("64px");
            GWT.log("Closing");
        });
        sideNav.addOpenedHandler(event -> {
            namePanel.setVisible(true);
            GWT.log("OPened");
        });
        sideNav.addClosedHandler(event -> {
            namePanel.setVisible(false);
        });*/

    }
}
