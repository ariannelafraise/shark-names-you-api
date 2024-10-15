package dev.paintilya.sharknamesyouapi.dao;

import dev.paintilya.sharknamesyouapi.model.Name;

import java.io.IOException;
import java.util.List;

public interface INameDAO {
    List<Name> getAll() throws IOException;
    Name getRandomName() throws IOException;
}
