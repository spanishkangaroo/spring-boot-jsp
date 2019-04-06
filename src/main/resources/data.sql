INSERT INTO issue_doc (id, name) VALUES (1, 'Issue Doc 1');
INSERT INTO issue_doc (id, name) VALUES (2, 'Issue Doc 2');
INSERT INTO issue_doc (id, name) VALUES (3, 'Issue Doc 3');

INSERT INTO issue (id, name) VALUES (1, 'Issue 1');
INSERT INTO issue (id, name) VALUES (2, 'Issue 2');
INSERT INTO issue (id, name) VALUES (3, 'Issue 3');

INSERT INTO issue_anomaly (id, name, issue_id, issuedoc_id) VALUES (1, 'Issue Anomaly 1 linked with Issue 1 and Issue Doc 1', 1, 1);
INSERT INTO issue_anomaly (id, name, issue_id, issuedoc_id) VALUES (2, 'Issue Anomaly 2 linked with Issue 1 and Issue Doc 2', 1, 2);
INSERT INTO issue_anomaly (id, name, issue_id, issuedoc_id) VALUES (3, 'Issue Anomaly 2 linked with Issue 2 and Issue Doc 1', 2, 1);
