//gridlayout to set all images to null

GridLayout gridLayout;
            gridLayout = (GridLayout) findViewById(R.id.gridLayout1);

            for(int i=0; i<9; i++) {

                ImageView counter = (ImageView) gridLayout.getChildAt(i);

                counter.setImageDrawable(null);
            }
