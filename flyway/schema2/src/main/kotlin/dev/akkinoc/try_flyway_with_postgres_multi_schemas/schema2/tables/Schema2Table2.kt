/*
 * This file is generated by jOOQ.
 */
package dev.akkinoc.try_flyway_with_postgres_multi_schemas.schema2.tables


import dev.akkinoc.try_flyway_with_postgres_multi_schemas.schema2.Schema2
import dev.akkinoc.try_flyway_with_postgres_multi_schemas.schema2.tables.records.Schema2Table2Record

import kotlin.collections.Collection

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Schema2Table2(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, Schema2Table2Record>?,
    parentPath: InverseForeignKey<out Record, Schema2Table2Record>?,
    aliased: Table<Schema2Table2Record>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<Schema2Table2Record>(
    alias,
    Schema2.SCHEMA2,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>schema2.schema2_table2</code>
         */
        val SCHEMA2_TABLE2: Schema2Table2 = Schema2Table2()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Schema2Table2Record> = Schema2Table2Record::class.java

    /**
     * The column <code>schema2.schema2_table2.id</code>.
     */
    val ID: TableField<Schema2Table2Record, Int?> = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    private constructor(alias: Name, aliased: Table<Schema2Table2Record>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<Schema2Table2Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<Schema2Table2Record>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>schema2.schema2_table2</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>schema2.schema2_table2</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>schema2.schema2_table2</code> table reference
     */
    constructor(): this(DSL.name("schema2_table2"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Schema2.SCHEMA2
    override fun getIdentity(): Identity<Schema2Table2Record, Int?> = super.getIdentity() as Identity<Schema2Table2Record, Int?>
    override fun `as`(alias: String): Schema2Table2 = Schema2Table2(DSL.name(alias), this)
    override fun `as`(alias: Name): Schema2Table2 = Schema2Table2(alias, this)
    override fun `as`(alias: Table<*>): Schema2Table2 = Schema2Table2(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Schema2Table2 = Schema2Table2(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Schema2Table2 = Schema2Table2(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Schema2Table2 = Schema2Table2(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Schema2Table2 = Schema2Table2(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Schema2Table2 = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Schema2Table2 = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Schema2Table2 = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Schema2Table2 = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Schema2Table2 = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Schema2Table2 = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Schema2Table2 = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Schema2Table2 = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Schema2Table2 = where(DSL.notExists(select))
}
