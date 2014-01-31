/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recipesearch;
import java.util.List;
import javax.swing.*;
import se.chalmers.ait.dat215.lab2.*;

/**
 *
 * @author Kuxe
 */
public class DishPanel extends javax.swing.JPanel{
    
	/**
	 * Creates new form DishPanel
	 * @param recipe
	 * Displays the recipe in this DishPanel
	 */
    public DishPanel(Recipe recipe) {
		this();
		
        setImage(recipe.getImage());
		setTypeIcon(null); //TODO FIXME
		setServings(recipe.getServings());
		setCuisine(recipe.getCuisine());
		setDifficulty(recipe.getDifficulty());
		setMatch(recipe.getMatch());
		setPrice(recipe.getPrice());
		setTime(recipe.getTime());
		setName(recipe.getName());
		setIngredients(recipe.getIngredients());
		setDescription(recipe.getDescription());
    }
	public DishPanel(){
		initComponents();
	}

	/** Setters used by controller to update view **/
	public void setImage(ImageIcon image){
		dishImage = new JLabel(image);
	}
	public void setTypeIcon(ImageIcon image){
		dishTypeIcon = new JLabel(image);
	}
	public void setType(String string){
		dishtypeLabel.setText(string);
	}
	public void setServings(int quantity){
		servingsDataLabel.setText("" + quantity + "st");
	}
	public void setCuisine(String cuisine){
		cuisineDataLabel.setText(cuisine);
	}
	public void setDifficulty(String difficulty){
		difficultyDataLabel.setText(difficulty);
	}
	public void setMatch(int procent){
		matchDataLabel.setText("" + procent + "%");
	}
	public void setPrice(int price){
		priceDataLabel.setText("" + price + "kr");
	}
	public void setTime(int time){
		timeDataLabel.setText("" + time + "m");
	}
	public void setName(String name){
		dishNameLabel.setText(name);
	}
	public void setIngredients(List<Ingredient> ingredients){
		String ingredientsText = "";
		for(Ingredient ingredient : ingredients){
			ingredientsText.concat("\n" + ingredient.getName() + ": "+
					ingredient.getUnit());
			
		}
		ingredientsTextArea.setText(ingredientsText);
	}
	public void setDescription(String string){
		descriptionTextArea.setText(string);
	}
	
	
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dishScrollPane = new javax.swing.JScrollPane();
        ScrollablePanel = new javax.swing.JPanel();
        dishNameLabel = new javax.swing.JLabel();
        ingredientsDescriptionSplitPanel = new javax.swing.JSplitPane();
        ingredientsScrollPanelSplit = new javax.swing.JScrollPane();
        ingredientsTextArea = new javax.swing.JTextArea();
        descriptionScrollPanelSplit = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        MiscInfoPanel = new javax.swing.JPanel();
        dishtypeLabel = new javax.swing.JLabel();
        dishInfoPanel = new javax.swing.JPanel();
        servingsLabel = new javax.swing.JLabel();
        matchLabel = new javax.swing.JLabel();
        cuisineLabel = new javax.swing.JLabel();
        difficultyLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        servingsDataLabel = new javax.swing.JLabel();
        cuisineDataLabel = new javax.swing.JLabel();
        difficultyDataLabel = new javax.swing.JLabel();
        matchDataLabel = new javax.swing.JLabel();
        priceDataLabel = new javax.swing.JLabel();
        timeDataLabel = new javax.swing.JLabel();
        dishImage = new javax.swing.JLabel();
        dishTypeIcon = new javax.swing.JLabel();
        ExpandButton = new javax.swing.JToggleButton();

        setAutoscrolls(true);

        dishScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        dishNameLabel.setText("<name>");

        ingredientsDescriptionSplitPanel.setBorder(null);

        ingredientsScrollPanelSplit.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ingredientsScrollPanelSplit.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ingredientsTextArea.setColumns(20);
        ingredientsTextArea.setLineWrap(true);
        ingredientsTextArea.setRows(5);
        ingredientsTextArea.setText("3st Majs\n5st Lingon\n8st grön\nEn juice");
        ingredientsTextArea.setMaximumSize(new java.awt.Dimension(4, 300));
        ingredientsTextArea.setMinimumSize(new java.awt.Dimension(4, 200));
        ingredientsScrollPanelSplit.setViewportView(ingredientsTextArea);

        ingredientsDescriptionSplitPanel.setLeftComponent(ingredientsScrollPanelSplit);

        descriptionScrollPanelSplit.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        descriptionScrollPanelSplit.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        descriptionTextArea.setEditable(false);
        descriptionTextArea.setColumns(20);
        descriptionTextArea.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean sodales orci sit amet lacus convallis tincidunt. Suspendisse lacinia ultrices urna eget euismod. Suspendisse ut lacu quis massa facilisis viverra et id urna. Aliquam non mattis justo. Suspendisse varius, dolor vel pharetra semper, odio quam egestas leo, eget dictum arcu odio sed felis. Nunc tincidunt nulla eu orci sollicitudin, sed vestibulum metus suscipit. Nam at dui iaculis, gravida nunc eu, fermentum elit. In ultrices tortor et risus sodales dapibus. Nulla facilisi. Integer laoreet, mi in ornare sollicitudin, odio est laoreet turpis, et vehicula sapien nulla in arcu. Vivamus vitae est elementum, condimentum nisl a, aliquet purus. Etiam at elit orci. Morbi eu adipiscing elit, at accumsan arcu.\n\nPellentesque sodales ipsum in sapien volutpat scelerisque. Sed dignissim lacinia magna, eget dignissim felis. Duis fermentum porttitor tempus. Mauris consectetur vestibulum elit sit amet facilisis. Vestibulum tempus blandit ornare. Nam id mattis dolor. Donec semper, nisi id viverra scelerisque, tortor diam interdum purus, in tempor erat leo et mi. Etiam vehicula nisi metus, a convallis ipsum elementum eget. Vestibulum blandit diam arcu, non vehicula turpis fermentum vitae.\n\nVestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; In sed feugiat massa. Morbi condimentum ante in enim congue semper. Maecenas dictum dolor nec dui dignissim, quis tincidunt leo laoreet. Nunc venenatis arcu ac enim elementum congue. Pellentesque fermentum magna arcu, nec dapibus lacus mollis quis. Nullam aliquam laoreet justo, at ullamcorper mi dignissim nec. Sed sit amet mollis erat, vitae pretium neque. Donec at velit in sem laoreet tristique sit amet vel sem. Vestibulum mauris leo, molestie non nunc id, bibendum feugiat arcu. Duis lobortis risus diam, id vulputate neque dignissim blandit. Curabitur bibendum tellus ut elit tincidunt, a blandit odio blandit. Morbi eu neque in diam placerat pulvinar. Vestibulum aliquet vitae libero non egestas.\n\nUt eleifend id nibh nec egestas. Sed sit amet tincidunt felis. Praesent dolor nunc, venenatis id fringilla sed, feugiat ut nisi. Vestibulum rhoncus, ante non venenatis feugiat, elit urna dictum turpis, vel rutrum nulla diam non massa. Nullam eget ipsum nec urna aliquam pulvinar. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus ac lectus vestibulum, bibendum turpis vitae, euismod arcu. Sed in nibh et arcu rutrum facilisis vel et lorem. Nullam quis dolor ultrices, pretium sapien luctus, tristique nulla. Fusce vehicula nisi orci, sed aliquet enim lobortis ac. Ut ac nibh vitae mi lobortis pellentesque. Nam eu tincidunt sem, eget hendrerit est. Quisque ac auctor ante. Sed et scelerisque sapien.\n\nAliquam volutpat, mauris non rhoncus convallis, mauris felis fringilla justo, vel iaculis arcu odio vitae dolor. Donec a auctor lacus, non imperdiet risus. Ut cursus fringilla eros, vitae dignissim lectus faucibus eget. Cras id arcu diam. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Pellentesque ultricies risus in ante pellentesque lobortis. Aenean dignissim risus id arcu tincidunt ultricies. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus urna diam, euismod in massa vel, tincidunt suscipit nisl. In luctus commodo arcu, in bibendum sapien consequat at. Fusce dapibus, sapien ac laoreet molestie, justo tellus consectetur risus, sed varius turpis diam et nibh.");
        descriptionTextArea.setToolTipText("Recipe description");
        descriptionTextArea.setAutoscrolls(false);
        descriptionTextArea.setBorder(null);
        descriptionScrollPanelSplit.setViewportView(descriptionTextArea);

        ingredientsDescriptionSplitPanel.setRightComponent(descriptionScrollPanelSplit);

        dishtypeLabel.setText("<dishtype>");

        dishInfoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        servingsLabel.setText("Servings");

        matchLabel.setText("Match");

        cuisineLabel.setText("Cuisine");

        difficultyLabel.setText("Difficulty");

        priceLabel.setText("Price");

        timeLabel.setText("Time");

        servingsDataLabel.setText("5st");

        cuisineDataLabel.setText("Svenskt");

        difficultyDataLabel.setText("Lätt");

        matchDataLabel.setText("75%");

        priceDataLabel.setText("35kr");

        timeDataLabel.setText("25m");

        javax.swing.GroupLayout dishInfoPanelLayout = new javax.swing.GroupLayout(dishInfoPanel);
        dishInfoPanel.setLayout(dishInfoPanelLayout);
        dishInfoPanelLayout.setHorizontalGroup(
            dishInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dishInfoPanelLayout.createSequentialGroup()
                .addGroup(dishInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cuisineLabel)
                    .addGroup(dishInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(difficultyLabel)
                        .addComponent(matchLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(priceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(timeLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(servingsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dishInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(servingsDataLabel)
                    .addComponent(cuisineDataLabel)
                    .addComponent(difficultyDataLabel)
                    .addComponent(matchDataLabel)
                    .addComponent(priceDataLabel)
                    .addComponent(timeDataLabel))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        dishInfoPanelLayout.setVerticalGroup(
            dishInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dishInfoPanelLayout.createSequentialGroup()
                .addGroup(dishInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(servingsLabel)
                    .addComponent(servingsDataLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dishInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuisineLabel)
                    .addComponent(cuisineDataLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dishInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(difficultyLabel)
                    .addComponent(difficultyDataLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dishInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matchLabel)
                    .addComponent(matchDataLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dishInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceDataLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dishInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel)
                    .addComponent(timeDataLabel)))
        );

        dishImage.setText("DISH IMAGE MISSING");

        dishTypeIcon.setText("DISH ICON MISSING");

        javax.swing.GroupLayout MiscInfoPanelLayout = new javax.swing.GroupLayout(MiscInfoPanel);
        MiscInfoPanel.setLayout(MiscInfoPanelLayout);
        MiscInfoPanelLayout.setHorizontalGroup(
            MiscInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiscInfoPanelLayout.createSequentialGroup()
                .addGroup(MiscInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dishInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MiscInfoPanelLayout.createSequentialGroup()
                        .addGroup(MiscInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MiscInfoPanelLayout.createSequentialGroup()
                                .addComponent(dishTypeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dishtypeLabel))
                            .addComponent(dishImage, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MiscInfoPanelLayout.setVerticalGroup(
            MiscInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiscInfoPanelLayout.createSequentialGroup()
                .addComponent(dishImage, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MiscInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dishtypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(dishTypeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(dishInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ScrollablePanelLayout = new javax.swing.GroupLayout(ScrollablePanel);
        ScrollablePanel.setLayout(ScrollablePanelLayout);
        ScrollablePanelLayout.setHorizontalGroup(
            ScrollablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScrollablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MiscInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ScrollablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ScrollablePanelLayout.createSequentialGroup()
                        .addComponent(dishNameLabel)
                        .addContainerGap(231, Short.MAX_VALUE))
                    .addComponent(ingredientsDescriptionSplitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        ScrollablePanelLayout.setVerticalGroup(
            ScrollablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScrollablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ScrollablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ScrollablePanelLayout.createSequentialGroup()
                        .addComponent(dishNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ingredientsDescriptionSplitPanel))
                    .addComponent(MiscInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        dishScrollPane.setViewportView(ScrollablePanel);

        ExpandButton.setText("Utöka recept");
        ExpandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpandButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExpandButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dishScrollPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dishScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExpandButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ExpandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpandButtonActionPerformed
        JToggleButton btn = (JToggleButton)evt.getSource();
		
		//If maximized
		if(btn.isSelected()){
			btn.setText("Minimera recept");
			
			//Enable scrolling in horizontal and vertical direction when maximized 
			dishScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
			descriptionScrollPanelSplit.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
			ingredientsScrollPanelSplit.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
			
			dishScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			descriptionScrollPanelSplit.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			ingredientsScrollPanelSplit.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		} else {
		//Else if minimized
			btn.setText("Utöka recept");
			
			
			//Scrollback textfields
			descriptionTextArea.setCaretPosition(0);
			ingredientsTextArea.setCaretPosition(0);
			
			//Reset scrollbars to 0, default location
			dishScrollPane.getHorizontalScrollBar().setValue(0);
			dishScrollPane.getVerticalScrollBar().setValue(0);
			descriptionScrollPanelSplit.getHorizontalScrollBar().setValue(0);
			descriptionScrollPanelSplit.getVerticalScrollBar().setValue(0);
			ingredientsScrollPanelSplit.getHorizontalScrollBar().setValue(0);
			ingredientsScrollPanelSplit.getVerticalScrollBar().setValue(0);
			
			//Disable scrolling in horizontal and vertical direction when minimized
			dishScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
			descriptionScrollPanelSplit.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
			ingredientsScrollPanelSplit.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
			dishScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			descriptionScrollPanelSplit.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			ingredientsScrollPanelSplit.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		}
    }//GEN-LAST:event_ExpandButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ExpandButton;
    private javax.swing.JPanel MiscInfoPanel;
    private javax.swing.JPanel ScrollablePanel;
    private javax.swing.JLabel cuisineDataLabel;
    private javax.swing.JLabel cuisineLabel;
    private javax.swing.JScrollPane descriptionScrollPanelSplit;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel difficultyDataLabel;
    private javax.swing.JLabel difficultyLabel;
    private javax.swing.JLabel dishImage;
    private javax.swing.JPanel dishInfoPanel;
    private javax.swing.JLabel dishNameLabel;
    private javax.swing.JScrollPane dishScrollPane;
    private javax.swing.JLabel dishTypeIcon;
    private javax.swing.JLabel dishtypeLabel;
    private javax.swing.JSplitPane ingredientsDescriptionSplitPanel;
    private javax.swing.JScrollPane ingredientsScrollPanelSplit;
    private javax.swing.JTextArea ingredientsTextArea;
    private javax.swing.JLabel matchDataLabel;
    private javax.swing.JLabel matchLabel;
    private javax.swing.JLabel priceDataLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel servingsDataLabel;
    private javax.swing.JLabel servingsLabel;
    private javax.swing.JLabel timeDataLabel;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
