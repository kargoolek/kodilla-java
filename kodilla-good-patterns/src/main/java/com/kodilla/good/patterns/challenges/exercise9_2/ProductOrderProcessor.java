package com.kodilla.good.patterns.challenges.exercise9_2;

public class ProductOrderProcessor {
    private InfoService infoService;
    private OrderService orderService;
    private ItemsRepository itemsRepository;

    public ProductOrderProcessor(final InfoService infoService,
                           final OrderService orderService,
                           final ItemsRepository itemsRepository) {
        this.infoService = infoService;
        this.orderService = orderService;
        this.itemsRepository = itemsRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isBoughtSuccess = orderService.buy(orderRequest.getUser(), orderRequest.getOrderedItems());

        if(isBoughtSuccess) {
            infoService.notify(orderRequest.getUser());
            itemsRepository.saveOrder(orderRequest.getUser(),orderRequest.getOrderedItems(),false, orderRequest.getOrderTime());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
