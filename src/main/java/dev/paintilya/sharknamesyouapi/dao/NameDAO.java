package dev.paintilya.sharknamesyouapi.dao;

import dev.paintilya.sharknamesyouapi.model.Name;

import com.opencsv.bean.CsvToBeanBuilder;

import org.springframework.core.io.Resource;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class NameDAO implements INameDAO {

    private final Resource dataFile;

    public NameDAO(Resource dataFile) {
        this.dataFile = dataFile;
    }

    @Override
    public List<Name> getAll() throws IOException {
        return new CsvToBeanBuilder<Name>(
                new FileReader(dataFile.getFile()
                ))
                .withType(Name.class).build().parse();
    }

    @Override
    public Name getRandomName() throws IOException {
        List<Name> allNames = this.getAll();
        int randomIndex = (int) (allNames.size() * Math.random());
        return allNames.get(randomIndex);
    }
}
