package com.company;

public class BuilderPattern {
    static class Coffee {
        private Coffee(Builder builder) {
            this.type = builder.type;
        }
        private String type, size;
        private boolean sugar, milk;
        public static class Builder {
            private String type, size;
            private boolean sugar, milk;
            public Builder(String type) {
                this.type = type;
            }
            public Builder sugar(boolean value) {
                this.sugar = value;
                return this;
            }
            public Builder milk(boolean value) {
                this.milk = value;
                return this;
            }

            public Builder size(String value) {
                this.size = value;
                return this;
            }
            public Coffee build() {
                return new Coffee(this);
            }
        }
    }
}
