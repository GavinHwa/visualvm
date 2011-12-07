/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * Contributor(s):
 * The Original Software is NetBeans. The Initial Developer of the Original
 * Software is Sun Microsystems, Inc. Portions Copyright 1997-2006 Sun
 * Microsystems, Inc. All Rights Reserved.
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 */

package org.netbeans.modules.profiler.attach.panels;

import java.text.MessageFormat;
import org.openide.util.NbBundle;

/**
 *
 * @author  Jaroslav Bachorik
 */
@NbBundle.Messages({
    "PerformIntegrationWizardPanelUI_PerformedStepsString=These steps will be performed by the Integration Wizard\\:",
    "PerformIntegrationWizardPanelUI_PerformIntegrationHintMsg=After you click <strong>Perform</strong>, the steps described above will be performed. Note that you cannot undo this action."
})
public class PerformIntegrationPanelUI extends javax.swing.JPanel {

  private PerformIntegrationPanel.Model model;

  /** Creates new form ManualIntegrationStepsPanelUI */
  PerformIntegrationPanelUI(PerformIntegrationPanel.Model model) {
    this.model = model;
    initComponents();
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPerform = new javax.swing.JButton();
        integrationSteps = new org.netbeans.modules.profiler.attach.panels.components.StepsPanelComponent();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(300, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));

        org.openide.awt.Mnemonics.setLocalizedText(buttonPerform, org.openide.util.NbBundle.getMessage(PerformIntegrationPanelUI.class, "PerformIntegrationPanelUI.buttonPerform.text")); // NOI18N
        buttonPerform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPerformActionPerformed(evt);
            }
        });

        integrationSteps.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/netbeans/modules/profiler/attach/panels/Bundle"); // NOI18N
        integrationSteps.setHintText(bundle.getString("PerformIntegrationWizardPanelUI_PerformIntegrationHintMsg")); // NOI18N
        integrationSteps.setMaximumSize(new java.awt.Dimension(400, 600));
        integrationSteps.setPreferredSize(new java.awt.Dimension(400, 250));
        integrationSteps.setTitle(bundle.getString("PerformIntegrationWizardPanelUI_PerformedStepsString")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(integrationSteps, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addComponent(buttonPerform))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(integrationSteps, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPerform)
                .addContainerGap())
        );

        buttonPerform.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(PerformIntegrationPanelUI.class, "PerformIntegrationPanelUI.buttonPerform.AccessibleContext.accessibleDescription")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents
  
    private void buttonPerformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPerformActionPerformed
      this.model.perform();
      refreshCanPerform();
    }//GEN-LAST:event_buttonPerformActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPerform;
    private org.netbeans.modules.profiler.attach.panels.components.StepsPanelComponent integrationSteps;
    // End of variables declaration//GEN-END:variables
  
  public void refresh() {
    this.integrationSteps.setSteps(this.model.getSummary());
    refreshCanPerform();
  }
  
  private void refreshCanPerform() {
    this.integrationSteps.setHintText(
        this.model.canPerform() ? 
            Bundle.PerformIntegrationWizardPanelUI_PerformIntegrationHintMsg() : 
            Bundle.PerformIntegrationWizardPanelUI_PerformedStepsString());
    buttonPerform.setEnabled(this.model.canPerform());
  }
}
