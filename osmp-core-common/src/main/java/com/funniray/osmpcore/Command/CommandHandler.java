package com.funniray.osmpcore.Command;

import com.funniray.osmpcore.Command.Executor.CommandSender;

public @interface CommandHandler {

    Class<? extends Command> command();

}
