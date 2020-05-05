(ns core)
(import 'javax.swing.JFrame)
(import 'javax.swing.JButton)
(import 'javax.swing.JPanel)
(import 'javax.swing.JOptionPane)
(import 'javax.swing.JTextField)
(import 'java.awt.event.ActionListener)

(defn -main []

(def frame (JFrame. "Name entry"))
(.setSize frame 250 250)
(.setVisible frame true)

(def panel (JPanel.))
(.setContentPane frame panel)

(def firstName (JTextField. "First name"))
(.add panel firstName)
(def lastName (JTextField. "Last name"))
(.add panel lastName)
(def button (JButton. "Submit!"))
(.add panel button)
(.revalidate button)

(defn submissionGOT []
        (JOptionPane/showMessageDialog
        nil "Thank you for your submission!" " "
        JOptionPane/INFORMATION_MESSAGE))
(def act (proxy [ActionListener] []
        (actionPerformed [event] (submissionGOT))))
(.addActionListener button act)

)


