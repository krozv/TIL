const products = [
    { title: 'Apple', isFruit: true, id: 1 },
    { title: 'Carrot', isFruit: false, id: 2 },
    { title: 'Grape', isFruit: true, id: 3 },
];

export default function ShoppingList() {
    const listItems = products.map(product => 
    <li
        key={product.id}
        style={{
            color: product.isFruit ? 'magenta':'darkgreen'
        }}    
    >
        {product.title}
    </li>);

    return (
        <ul>{listItems}</ul>
    );
}