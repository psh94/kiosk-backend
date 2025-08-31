DDL

create table category (
	id bigint generated always as identity primary key,
	name varchar(255) not null
)

create table users (
	id bigint generated always as identity primary key,
	name varchar(255) not null
)

create table menu (
	id bigint generated always as identity primary key,
	name varchar(255) not null,
	price bigint not null,
	category_id bigint not null,
	constraint fk_menu_category
		foreign key (category_id)
		references category (id)
		on delete cascade
)

create table orders (
	id bigint generated always as identity primary key,
	date timestamp,
	user_id bigint not null,
	constraint fk_order_user
		foreign key (user_id)
		references users (id)
		on delete cascade
)

create table orderItems (
	id bigint generated always as identity primary key,
	quantity int not null,
	menu_id bigint not null,
	order_id bigint not null,
	constraint fk_order_items_order
		foreign key (order_id)
		references orders (id)
		on delete cascade,
	constraint fk_order_items_menu
		foreign key (menu_id)
		references menu (id)
		on delete cascade
)
