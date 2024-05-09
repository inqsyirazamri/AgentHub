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
(13, 'Daniel Suhaimi', 'dan@gmail.com', '0123456789', 'user2', 'a791842f52a0acfbb3a783378c066b8', 'AGENT'),
(14, 'Mohamed Arique bin Mohd Aziyen', 'arique@gmail.com', '9876543210', 'user3', 'affec3b64cf90492377a8114c86fc093', 'AGENT');

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