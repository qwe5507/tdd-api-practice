package com.example.productorderservice.product;

class ProductAdaptor implements ProductPort {
    private final ProductRepository productRepository;

    public ProductAdaptor(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void save(final Product product) {
        productRepository.save(product);
    }
}
