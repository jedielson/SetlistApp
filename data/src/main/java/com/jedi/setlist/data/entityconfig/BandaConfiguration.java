package com.jedi.setlist.data.entityconfig;

import android.provider.ContactsContract;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseFieldConfig;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTableConfig;
import com.jedi.setlist.domain.entities.Banda;

import java.util.ArrayList;

/**
 * Created by Jedi on 08-Jun-15.
 *
 */
public class BandaConfiguration extends DatabaseTableConfig<Banda>{

    public BandaConfiguration() {

        ArrayList<DatabaseFieldConfig> fields = new ArrayList<>();
        fields.add(getBandaIdField());
        fields.add(getNomeField());
        fields.add(getDataDeCriacaoField());
        setFieldConfigs(fields);
    }

    private DatabaseFieldConfig getBandaIdField() {
        DatabaseFieldConfig fieldBandaId = new DatabaseFieldConfig();
        fieldBandaId.setFieldName("BandaId");
        fieldBandaId.setColumnName("BandaId");
        fieldBandaId.setGeneratedId(true);
        return fieldBandaId;
    }

    private DatabaseFieldConfig getNomeField(){
        DatabaseFieldConfig fieldNome = new DatabaseFieldConfig();
        fieldNome.setFieldName("Nome");
        fieldNome.setColumnName("Nome");
        fieldNome.setDataType(DataType.STRING);
        fieldNome.setWidth(100);
        return fieldNome;
    }

    private DatabaseFieldConfig getDataDeCriacaoField(){
        DatabaseFieldConfig fieldDataDeCriacao = new DatabaseFieldConfig();
        fieldDataDeCriacao.setFieldName("DataDeCriacao");
        fieldDataDeCriacao.setColumnName("DataDeCriacao");
        fieldDataDeCriacao.setDataType(DataType.DATE_STRING);
        fieldDataDeCriacao.setFormat("yyyy-MM-dd HH:mm:ss");
        fieldDataDeCriacao.setWidth(100);
        return fieldDataDeCriacao;
    }
}
