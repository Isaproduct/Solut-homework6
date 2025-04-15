Part 1: Chain of Responsibility — Tech Support Request Handler
Code Explanation:
In this example, we use the Chain of Responsibility pattern, which allows creating a chain of request handlers. Each handler (such as FAQBot, JuniorSupport, and SeniorSupport) checks if it can process a request and, if not, passes it to the next handler in the chain.

SupportHandler (abstract class):

The set_next(handler) method is used to set the next handler in the chain.

The handle(issue) method is abstract and should be implemented by each concrete handler to either process the issue or pass it to the next handler.

Concrete Handlers:

FAQBotHandler — handles simple issues like password_reset.

JuniorSupportHandler — handles more complex issues like refund_request and billing_issue.

SeniorSupportHandler — handles even more complex issues like account_ban and data_loss.

Chain of Responsibility:

Each handler sets the next handler using the set_next() method. This allows the issue to be passed from one handler to the next until it is resolved.

Testing:

A list of issues is created, and for each issue, the handle() method is called. This method either resolves the issue or passes it to the next handler in the chain.


Part 2: Command Pattern — Smart Home Remote Control
Code Explanation:
In this part, we implement the Command Pattern to create a smart home remote control system. The Command Pattern decouples the invoker (the remote control) from the receiver (the devices). Each button on the remote control represents a command, and the remote doesn't need to know how the light, thermostat, or other devices work — it just tells the command object to execute.

Command Interface:

The Command interface defines two methods: execute() to perform the action and undo() to reverse the action.

Receivers (Devices):

Light and Thermostat are receivers that perform the actual actions when the commands are executed.

Concrete Command Classes:

TurnOnLightCommand: A concrete command to turn on the light.

SetThermostatCommand: A concrete command to set the temperature on the thermostat.

Invoker (SmartHomeRemoteControl):

The remote control stores a dictionary of command slots and has methods press_button(slot) and undo_button() to execute or undo commands.

Client Code:

The client assigns commands to the remote control slots and then executes or undoes them.
