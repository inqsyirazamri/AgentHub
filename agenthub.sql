USE agenthub;

--
-- Table structure for table `users`
--
DROP TABLE users;
CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(200) NOT NULL,
  `role` varchar(20) NOT NULL
);

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `fullname`, `email`, `phone`, `username`, `password`, `role`) VALUES
(12, 'Nur Inqsyira bt Zamri', 'cira@gmail.com', '0194732486', 'user1', 'cc03e747a6afbbcbf8be7668acfebee5', 'ADMINISTRATOR'),
(13, 'Daniel Suhaimi', 'dan@gmail.com', '0123456789', 'user2', 'cc03e747a6afbbcbf8be7668acfebee5', 'AGENT'),
(14, 'Mohamed Arique bin Mohd Aziyen', 'arique@gmail.com', '9876543210', 'user3', 'affec3b64cf90492377a8114c86fc093', 'AGENT');

--
-- Table structure for table `products`
--
DROP TABLE products;
CREATE TABLE `products` (
  `pid` int(3) NOT NULL,
  `productcode` varchar(5) NOT NULL,
  `productname` varchar(50) NOT NULL,
  `agentprice` double NOT NULL,
  `sellingprice` double NOT NULL
);

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`pid`, `productcode`, `productname`, `agentprice`, `sellingprice`) VALUES
(01, 'prod1', 'The City Works Tokyo Notebook', 79, 95),
(02, 'prod2', 'The City Works Melbourne Notebook', 89, 109),
(03, 'prod3', 'The City Works Malaysia Notebook', 99, 119),
(04, 'prod4', 'Lico Notebook in Terracotta', 95, 115),
(05, 'prod5', 'Lico Notebook in Brown', 105, 125),
(06, 'prod6', 'Lico Notebook in Sand', 115, 135);

--
-- Table structure for table `agents`
--
DROP TABLE agents;
CREATE TABLE `agents` (
  `sid` int(11) NOT NULL,
  `agentcode` varchar(100) NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(10) NOT NULL
) 

--
-- Dumping data for table `agents`
--

INSERT INTO `agents` (`sid`, `agentcode`, `fullname`, `email`, `phone`) VALUES
(69, 'age5', 'Daniel Suhaimi', 'dan@gmail.com', '0123456789'),
(68, 'age4', 'Mohamed Arique bin Mohd Aziyen', 'arique@gmail.com', '9876543210');

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`pid`);

--
-- Indexes for table `agents`
--
ALTER TABLE `agents`
  ADD PRIMARY KEY (`sid`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=58;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `pid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=79;

--
-- AUTO_INCREMENT for table `agents`
--
ALTER TABLE `agents`
  MODIFY `sid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=143;

