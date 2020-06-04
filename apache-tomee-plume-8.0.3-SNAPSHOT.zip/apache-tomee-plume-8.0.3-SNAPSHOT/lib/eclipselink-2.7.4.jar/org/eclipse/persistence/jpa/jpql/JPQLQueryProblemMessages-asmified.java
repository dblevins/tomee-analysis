package asm.org.eclipse.persistence.jpa.jpql;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class JPQLQueryProblemMessagesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/jpa/jpql/JPQLQueryProblemMessages", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbsExpression_InvalidExpression", "Ljava/lang/String;", null, "ABS_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbsExpression_InvalidNumericExpression", "Ljava/lang/String;", null, "ABS_EXPRESSION_INVALID_NUMERIC_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbsExpression_MissingExpression", "Ljava/lang/String;", null, "ABS_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbsExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "ABS_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbsExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "ABS_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbstractFromClause_IdentificationVariableDeclarationEndsWithComma", "Ljava/lang/String;", null, "ABSTRACT_FROM_CLAUSE_IDENTIFICATION_VARIABLE_DECLARATION_ENDS_WITH_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbstractFromClause_IdentificationVariableDeclarationIsMissingComma", "Ljava/lang/String;", null, "ABSTRACT_FROM_CLAUSE_IDENTIFICATION_VARIABLE_DECLARATION_IS_MISSING_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbstractFromClause_InvalidFirstIdentificationVariableDeclaration", "Ljava/lang/String;", null, "ABSTRACT_FROM_CLAUSE_INVALID_FIRST_IDENTIFICATION_VARIABLE_DECLARATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbstractFromClause_MissingIdentificationVariableDeclaration", "Ljava/lang/String;", null, "ABSTRACT_FROM_CLAUSE_MISSING_IDENTIFICATION_VARIABLE_DECLARATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbstractFromClause_WrongOrderOfIdentificationVariableDeclaration", "Ljava/lang/String;", null, "ABSTRACT_FROM_CLAUSE_WRONG_ORDER_OF_IDENTIFICATION_VARIABLE_DECLARATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbstractPathExpression_CannotEndWithComma", "Ljava/lang/String;", null, "ABSTRACT_PATH_EXPRESSION_CANNOT_END_WITH_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbstractPathExpression_InvalidIdentificationVariable", "Ljava/lang/String;", null, "ABSTRACT_PATH_EXPRESSION_INVALID_IDENTIFICATION_VARIABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbstractPathExpression_MissingIdentificationVariable", "Ljava/lang/String;", null, "ABSTRACT_PATH_EXPRESSION_MISSING_IDENTIFICATION_VARIABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbstractSchemaName_Invalid", "Ljava/lang/String;", null, "ABSTRACT_SCHEMA_NAME_INVALID");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbstractSelectClause_InvalidSelectExpression", "Ljava/lang/String;", null, "ABSTRACT_SELECT_CLAUSE_INVALID_SELECT_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbstractSelectClause_MissingSelectExpression", "Ljava/lang/String;", null, "ABSTRACT_SELECT_CLAUSE_MISSING_SELECT_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbstractSelectClause_SelectExpressionEndsWithComma", "Ljava/lang/String;", null, "ABSTRACT_SELECT_CLAUSE_SELECT_EXPRESSION_ENDS_WITH_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbstractSelectClause_SelectExpressionIsMissingComma", "Ljava/lang/String;", null, "ABSTRACT_SELECT_CLAUSE_SELECT_EXPRESSION_IS_MISSING_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbstractSelectClause_SelectExpressionMissing", "Ljava/lang/String;", null, "ABSTRACT_SELECT_CLAUSE_SELECT_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AbstractSelectStatement_FromClauseMissing", "Ljava/lang/String;", null, "ABSTRACT_SELECT_STATEMENT_FROM_CLAUSE_MSSING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AdditionExpression_LeftExpression_WrongType", "Ljava/lang/String;", null, "ADDITION_EXPRESSION_LEFT_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AdditionExpression_RightExpression_WrongType", "Ljava/lang/String;", null, "ADDITION_EXPRESSION_RIGHT_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AggregateFunction_WrongClause", "Ljava/lang/String;", null, "AGGREGATE_FUNCTION_WRONG_CLAUSE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AllOrAnyExpression_All_ParentNotComparisonExpression", "Ljava/lang/String;", null, "ALL_OR_ANY_EXPRESSION_PARENT_NOT_COMPARISON_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AllOrAnyExpression_Any_ParentNotComparisonExpression", "Ljava/lang/String;", null, "ALL_OR_ANY_EXPRESSION_PARENT_NOT_COMPARISON_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AllOrAnyExpression_InvalidExpression", "Ljava/lang/String;", null, "ALL_OR_ANY_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AllOrAnyExpression_MissingExpression", "Ljava/lang/String;", null, "ALL_OR_ANY_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AllOrAnyExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "ALL_OR_ANY_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AllOrAnyExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "ALL_OR_ANY_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AllOrAnyExpression_NotPartOfComparisonExpression", "Ljava/lang/String;", null, "ALL_OR_ANY_EXPRESSION_NOT_PART_OF_COMPARISON_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AllOrAnyExpression_Some_ParentNotComparisonExpression", "Ljava/lang/String;", null, "ALL_OR_ANY_EXPRESSION_PARENT_NOT_COMPARISON_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ArithmeticExpression_InvalidLeftExpression", "Ljava/lang/String;", null, "ARITHMETIC_EXPRESSION_INVALID_LEFT_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ArithmeticExpression_InvalidRightExpression", "Ljava/lang/String;", null, "ARITHMETIC_EXPRESSION_INVALID_RIGHT_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ArithmeticExpression_MissingLeftExpression", "Ljava/lang/String;", null, "ARITHMETIC_EXPRESSION_MISSING_LEFT_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ArithmeticExpression_MissingRightExpression", "Ljava/lang/String;", null, "ARITHMETIC_EXPRESSION_MISSING_RIGHT_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ArithmeticFactor_InvalidExpression", "Ljava/lang/String;", null, "ARITHMETIC_FACTOR_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ArithmeticFactor_MissingExpression", "Ljava/lang/String;", null, "ARITHMETIC_FACTOR_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AvgFunction_InvalidExpression", "Ljava/lang/String;", null, "AVG_FUNCTION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AvgFunction_InvalidNumericExpression", "Ljava/lang/String;", null, "AVG_FUNCTION_INVALID_NUMERIC_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AvgFunction_MissingExpression", "Ljava/lang/String;", null, "AVG_FUNCTION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AvgFunction_MissingLeftParenthesis", "Ljava/lang/String;", null, "AVG_FUNCTION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AvgFunction_MissingRightParenthesis", "Ljava/lang/String;", null, "AVG_FUNCTION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BadExpression_InvalidExpression", "Ljava/lang/String;", null, "BAD_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BetweenExpression_MissingAnd", "Ljava/lang/String;", null, "BETWEEN_EXPRESSION_MISSING_AND");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BetweenExpression_MissingExpression", "Ljava/lang/String;", null, "BETWEEN_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BetweenExpression_MissingLowerBoundExpression", "Ljava/lang/String;", null, "BETWEEN_EXPRESSION_MISSING_LOWER_BOUND_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BetweenExpression_MissingUpperBoundExpression", "Ljava/lang/String;", null, "BETWEEN_EXPRESSION_MISSING_UPPER_BOUND_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BetweenExpression_WrongType", "Ljava/lang/String;", null, "BETWEEN_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CaseExpression_InvalidJPAVersion", "Ljava/lang/String;", null, "CASE_EXPRESSION_INVALID_JPA_VERSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CaseExpression_MissingElseExpression", "Ljava/lang/String;", null, "CASE_EXPRESSION_MISSING_ELSE_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CaseExpression_MissingElseIdentifier", "Ljava/lang/String;", null, "CASE_EXPRESSION_MISSING_ELSE_IDENTIFIER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CaseExpression_MissingEndIdentifier", "Ljava/lang/String;", null, "CASE_EXPRESSION_MISSING_END_IDENTIFIER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CaseExpression_MissingWhenClause", "Ljava/lang/String;", null, "CASE_EXPRESSION_MISSING_WHEN_CLAUSE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CaseExpression_WhenClausesEndWithComma", "Ljava/lang/String;", null, "CASE_EXPRESSION_WHEN_CLAUSES_END_WITH_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CaseExpression_WhenClausesHasComma", "Ljava/lang/String;", null, "CASE_EXPRESSION_WHEN_CLAUSES_HAS_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CastExpression_InvalidExpression", "Ljava/lang/String;", null, "CAST_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CastExpression_InvalidJPAVersion", "Ljava/lang/String;", null, "CAST_EXPRESSION_INVALID_JPA_VERSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CastExpression_MissingDatabaseType", "Ljava/lang/String;", null, "CAST_EXPRESSION_MISSING_DATABASE_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CastExpression_MissingExpression", "Ljava/lang/String;", null, "CAST_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CastExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "CAST_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CastExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "CAST_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CoalesceExpression_InvalidExpression", "Ljava/lang/String;", null, "COALESCE_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CoalesceExpression_InvalidJPAVersion", "Ljava/lang/String;", null, "COALESCE_EXPRESSION_INVALID_JPA_VERSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CoalesceExpression_MissingExpression", "Ljava/lang/String;", null, "COALESCE_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CoalesceExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "COALESCE_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CoalesceExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "COALESCE_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CollectionExpression_MissingExpression", "Ljava/lang/String;", null, "COLLECTION_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CollectionMemberDeclaration_MissingCollectionValuedPathExpression", "Ljava/lang/String;", null, "COLLECTION_MEMBER_DECLARATION_MISSING_COLLECTION_VALUED_PATH_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CollectionMemberDeclaration_MissingIdentificationVariable", "Ljava/lang/String;", null, "COLLECTION_MEMBER_DECLARATION_MISSING_IDENTIFICATION_VARIABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CollectionMemberDeclaration_MissingLeftParenthesis", "Ljava/lang/String;", null, "COLLECTION_MEMBER_DECLARATION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CollectionMemberDeclaration_MissingRightParenthesis", "Ljava/lang/String;", null, "COLLECTION_MEMBER_DECLARATION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CollectionMemberExpression_Embeddable", "Ljava/lang/String;", null, "COLLECTION_MEMBER_EXPRESSION_EMBEDDABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CollectionMemberExpression_MissingCollectionValuedPathExpression", "Ljava/lang/String;", null, "COLLECTION_MEMBER_EXPRESSION_MISSING_COLLECTION_VALUED_PATH_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CollectionMemberExpression_MissingEntityExpression", "Ljava/lang/String;", null, "COLLECTION_MEMBER_EXPRESSION_MISSING_ENTITY_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CollectionValuedPathExpression_NotCollectionType", "Ljava/lang/String;", null, "COLLECTION_VALUED_PATH_EXPRESSION_NOT_COLLECTION_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CollectionValuedPathExpression_NotResolvable", "Ljava/lang/String;", null, "COLLECTION_VALUED_PATH_EXPRESSION_NOT_RESOLVABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ComparisonExpression_AssociationField", "Ljava/lang/String;", null, "COMPARISON_EXPRESSION_ASSOCIATION_FIELD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ComparisonExpression_BasicField", "Ljava/lang/String;", null, "COMPARISON_EXPRESSION_BASIC_FIELD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ComparisonExpression_IdentificationVariable", "Ljava/lang/String;", null, "COMPARISON_EXPRESSION_IDENTIFICATION_VARIABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ComparisonExpression_MissingLeftExpression", "Ljava/lang/String;", null, "COMPARISON_EXPRESSION_MISSING_LEFT_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ComparisonExpression_MissingRightExpression", "Ljava/lang/String;", null, "COMPARISON_EXPRESSION_MISSING_RIGHT_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ComparisonExpression_WrongComparisonType", "Ljava/lang/String;", null, "COMPARISON_EXPRESSION_WRONG_COMPARISON_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ConcatExpression_Expression_WrongType", "Ljava/lang/String;", null, "CONCAT_EXPRESSION_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ConcatExpression_InvalidExpression", "Ljava/lang/String;", null, "CONCAT_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ConcatExpression_MissingExpression", "Ljava/lang/String;", null, "CONCAT_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ConcatExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "CONCAT_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ConcatExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "CONCAT_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ConstructorExpression_ConstructorItemEndsWithComma", "Ljava/lang/String;", null, "CONSTRUCTOR_EXPRESSION_CONSTRUCTOR_ITEM_ENDS_WITH_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ConstructorExpression_ConstructorItemIsMissingComma", "Ljava/lang/String;", null, "CONSTRUCTOR_EXPRESSION_CONSTRUCTOR_ITEM_IS_MISSING_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ConstructorExpression_MissingConstructorItem", "Ljava/lang/String;", null, "CONSTRUCTOR_EXPRESSION_MISSING_CONSTRUCTOR_ITEM");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ConstructorExpression_MissingConstructorName", "Ljava/lang/String;", null, "CONSTRUCTOR_EXPRESSION_MISSING_CONSTRUCTOR_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ConstructorExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "CONSTRUCTOR_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ConstructorExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "CONSTRUCTOR_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ConstructorExpression_UndefinedConstructor", "Ljava/lang/String;", null, "CONSTRUCTOR_EXPRESSION_UNDEFINED_CONSTRUCTOR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ConstructorExpression_UnknownType", "Ljava/lang/String;", null, "CONSTRUCTOR_EXPRESSION_UNKNOWN_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CountFunction_DistinctEmbeddable", "Ljava/lang/String;", null, "COUNT_FUNCTION_DISTINCT_EMBEDDABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CountFunction_InvalidExpression", "Ljava/lang/String;", null, "COUNT_FUNCTION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CountFunction_MissingExpression", "Ljava/lang/String;", null, "COUNT_FUNCTION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CountFunction_MissingLeftParenthesis", "Ljava/lang/String;", null, "COUNT_FUNCTION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CountFunction_MissingRightParenthesis", "Ljava/lang/String;", null, "COUNT_FUNCTION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DatabaseType_InvalidFirstExpression", "Ljava/lang/String;", null, "DATABASE_TYPE_INVALID_FIRST_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DatabaseType_InvalidSecondExpression", "Ljava/lang/String;", null, "DATABASE_TYPE_INVALID_SECOND_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DatabaseType_MissingComma", "Ljava/lang/String;", null, "DATABASE_TYPE_MISSING_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DatabaseType_MissingFirstExpression", "Ljava/lang/String;", null, "DATABASE_TYPE_MISSING_FIRST_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DatabaseType_MissingLeftParenthesis", "Ljava/lang/String;", null, "DATABASE_TYPE_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DatabaseType_MissingRightParenthesis", "Ljava/lang/String;", null, "DATABASE_TYPE_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DatabaseType_MissingSecondExpression", "Ljava/lang/String;", null, "DATABASE_TYPE_MISSING_SECOND_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DateTime_JDBCEscapeFormat_InvalidSpecification", "Ljava/lang/String;", null, "DATE_TIME_JDBC_ESCAPE_FORMAT_INVALID_SPECIFICATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DateTime_JDBCEscapeFormat_MissingCloseQuote", "Ljava/lang/String;", null, "DATE_TIME_JDBC_ESCAPE_FORMAT_MISSING_CLOSE_QUOTE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DateTime_JDBCEscapeFormat_MissingOpenQuote", "Ljava/lang/String;", null, "DATE_TIME_JDBC_ESCAPE_FORMAT_MISSING_OPEN_QUOTE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DateTime_JDBCEscapeFormat_MissingRightCurlyBrace", "Ljava/lang/String;", null, "DATE_TIME_JDBC_ESCAPE_FORMAT_MISSING_RIGHT_CURLY_BRACE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DeleteClause_FromMissing", "Ljava/lang/String;", null, "DELETE_CLAUSE_FROM_MISSING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DeleteClause_MultipleRangeVariableDeclaration", "Ljava/lang/String;", null, "DELETE_CLAUSE_MULTIPLE_RANGE_VARIABLE_DECLARATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DeleteClause_RangeVariableDeclarationMalformed", "Ljava/lang/String;", null, "DELETE_CLAUSE_RANGE_VARIABLE_DECLARATION_MALFORMED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DeleteClause_RangeVariableDeclarationMissing", "Ljava/lang/String;", null, "DELETE_CLAUSE_RANGE_VARIABLE_DECLARATION_MISSING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DivisionExpression_LeftExpression_WrongType", "Ljava/lang/String;", null, "DIVISION_EXPRESSION_LEFT_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DivisionExpression_RightExpression_WrongType", "Ljava/lang/String;", null, "DIVISION_EXPRESSION_RIGHT_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EmptyCollectionComparisonExpression_MissingExpression", "Ljava/lang/String;", null, "EMPTY_COLLECTION_COMPARISON_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EncapsulatedIdentificationVariableExpression_NotMapValued", "Ljava/lang/String;", null, "ENCAPSULATED_IDENTIFICATION_VARIABLE_EXPRESSION_NOT_MAP_VALUED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EntityTypeLiteral_InvalidJPAVersion", "Ljava/lang/String;", null, "ENTITY_TYPE_LITERAL_INVALID_JPA_VERSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EntityTypeLiteral_NotResolvable", "Ljava/lang/String;", null, "ENTITY_TYPE_LITERAL_NOT_RESOLVABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EntryExpression_InvalidExpression", "Ljava/lang/String;", null, "ENTRY_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EntryExpression_InvalidJPAVersion", "Ljava/lang/String;", null, "ENTRY_EXPRESSION_INVALID_JPA_VERSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EntryExpression_MissingExpression", "Ljava/lang/String;", null, "ENTRY_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EntryExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "ENTRY_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EntryExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "ENTRY_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ExistsExpression_InvalidExpression", "Ljava/lang/String;", null, "EXISTS_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ExistsExpression_MissingExpression", "Ljava/lang/String;", null, "EXISTS_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ExistsExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "EXISTS_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ExistsExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "EXISTS_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ExtractExpression_InvalidExpression", "Ljava/lang/String;", null, "EXTRACT_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ExtractExpression_InvalidJPAVersion", "Ljava/lang/String;", null, "EXTRACT_EXPRESSION_INVALID_JPA_VERSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ExtractExpression_MissingDatePart", "Ljava/lang/String;", null, "EXTRACT_EXPRESSION_MISSING_DATE_PART");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ExtractExpression_MissingExpression", "Ljava/lang/String;", null, "EXTRACT_EXPRESSION_MISSING_DATE_PART");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ExtractExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "EXTRACT_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ExtractExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "EXTRACT_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FunctionExpression_HasExpression", "Ljava/lang/String;", null, "FUNCTION_EXPRESSION_HAS_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FunctionExpression_InvalidExpression", "Ljava/lang/String;", null, "FUNCTION_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FunctionExpression_InvalidJPAVersion", "Ljava/lang/String;", null, "FUNCTION_EXPRESSION_INVALID_JPA_VERSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FunctionExpression_MissingExpression", "Ljava/lang/String;", null, "FUNCTION_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FunctionExpression_MissingFunctionName", "Ljava/lang/String;", null, "FUNCTION_EXPRESSION_MISSING_FUNCTION_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FunctionExpression_MissingOneExpression", "Ljava/lang/String;", null, "FUNCTION_EXPRESSION_MISSING_ONE_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FunctionExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "FUNCTION_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FunctionExpression_MoreThanOneExpression", "Ljava/lang/String;", null, "FUNCTION_EXPRESSION_MORE_THAN_ONE_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FunctionExpression_UnknownColumn", "Ljava/lang/String;", null, "FUNCTION_EXPRESSION_UNKNOWN_COLUMN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GroupByClause_GroupByItemEndsWithComma", "Ljava/lang/String;", null, "GROUP_BY_CLAUSE_GROUP_BY_ITEM_ENDS_WITH_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GroupByClause_GroupByItemIsMissingComma", "Ljava/lang/String;", null, "GROUP_BY_CLAUSE_GROUP_BY_ITEM_IS_MISSING_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GroupByClause_GroupByItemMissing", "Ljava/lang/String;", null, "GROUP_BY_CLAUSE_GROUP_BY_ITEM_MISSING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HavingClause_InvalidConditionalExpression", "Ljava/lang/String;", null, "HAVING_CLAUSE_INVALID_CONDITIONAL_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HavingClause_MissingConditionalExpression", "Ljava/lang/String;", null, "HAVING_CLAUSE_MISSING_CONDITIONAL_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HermesParser_GrammarValidator_ErrorMessage", "Ljava/lang/String;", null, "HERMES_PARSER_GRAMMAR_VALIDATOR_ERROR_MESSAGE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HermesParser_SemanticValidator_ErrorMessage", "Ljava/lang/String;", null, "HERMES_PARSER_SEMANTIC_VALIDATOR_ERROR_MESSAGE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HermesParser_UnexpectedException_ErrorMessage", "Ljava/lang/String;", null, "HERMES_PARSER_UNEXPECTED_EXCEPTION_ERROR_MESSAGE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IdentificationVariable_EntityName", "Ljava/lang/String;", null, "IDENTIFICATION_VARIABLE_ENTITY_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IdentificationVariable_Invalid_Duplicate", "Ljava/lang/String;", null, "IDENTIFICATION_VARIABLE_INVALID_DUPLICATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IdentificationVariable_Invalid_JavaIdentifier", "Ljava/lang/String;", null, "IDENTIFICATION_VARIABLE_INVALID_JAVA_IDENTIFIER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IdentificationVariable_Invalid_NotDeclared", "Ljava/lang/String;", null, "IDENTIFICATION_VARIABLE_INVALID_NOT_DECLARED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IdentificationVariable_Invalid_ReservedWord", "Ljava/lang/String;", null, "IDENTIFICATION_VARIABLE_INVALID_RESERVED_WORD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IdentificationVariableDeclaration_JoinsEndWithComma", "Ljava/lang/String;", null, "IDENTIFICATION_VARIABLE_DECLARATION_JOINS_END_WITH_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IdentificationVariableDeclaration_JoinsHaveComma", "Ljava/lang/String;", null, "IDENTIFICATION_VARIABLE_DECLARATION_JOINS_HAS_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IdentificationVariableDeclaration_MissingRangeVariableDeclaration", "Ljava/lang/String;", null, "IDENTIFICATION_VARIABLE_DECLARATION_MISSING_RANGE_VARIABLE_DECLARATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IndexExpression_InvalidExpression", "Ljava/lang/String;", null, "INDEX_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IndexExpression_InvalidJPAVersion", "Ljava/lang/String;", null, "INDEX_EXPRESSION_INVALID_JPA_VERSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IndexExpression_MissingExpression", "Ljava/lang/String;", null, "INDEX_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IndexExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "INDEX_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IndexExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "INDEX_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IndexExpression_WrongVariable", "Ljava/lang/String;", null, "INDEX_EXPRESSION_WRONG_VARIABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "InExpression_InvalidExpression", "Ljava/lang/String;", null, "IN_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "InExpression_InvalidItemCount", "Ljava/lang/String;", null, "IN_EXPRESSION_INVALID_ITEM_COUNT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "InExpression_ItemEndsWithComma", "Ljava/lang/String;", null, "IN_EXPRESSION_ITEM_ENDS_WITH_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "InExpression_ItemInvalidExpression", "Ljava/lang/String;", null, "IN_EXPRESSION_ITEM_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "InExpression_ItemIsMissingComma", "Ljava/lang/String;", null, "IN_EXPRESSION_ITEM_IS_MISSING_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "InExpression_MissingExpression", "Ljava/lang/String;", null, "IN_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "InExpression_MissingInItems", "Ljava/lang/String;", null, "IN_EXPRESSION_MISSING_IN_ITEMS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "InExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "IN_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "InExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "IN_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "InputParameter_JavaIdentifier", "Ljava/lang/String;", null, "INPUT_PARAMETER_JAVA_IDENTIFIER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "InputParameter_MissingParameter", "Ljava/lang/String;", null, "INPUT_PARAMETER_MISSING_PARAMETER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "InputParameter_Mixture", "Ljava/lang/String;", null, "INPUT_PARAMETER_MIXTURE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "InputParameter_NotInteger", "Ljava/lang/String;", null, "INPUT_PARAMETER_NOT_INTEGER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "InputParameter_SmallerThanOne", "Ljava/lang/String;", null, "INPUT_PARAMETER_SMALLER_THAN_ONE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "InputParameter_WrongClauseDeclaration", "Ljava/lang/String;", null, "INPUT_PARAMETER_WRONG_CLAUSE_DECLARATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Join_InvalidIdentifier", "Ljava/lang/String;", null, "JOIN_INVALID_IDENTIFIER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Join_InvalidJoinAssociationPath", "Ljava/lang/String;", null, "JOIN_INVALID_JOIN_ASSOCIATION_PATH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Join_MissingIdentificationVariable", "Ljava/lang/String;", null, "JOIN_MISSING_IDENTIFICATION_VARIABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Join_MissingJoinAssociationPath", "Ljava/lang/String;", null, "JOIN_MISSING_JOIN_ASSOCIATION_PATH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JoinFetch_InvalidIdentification", "Ljava/lang/String;", null, "JOIN_FETCH_INVALID_IDENTIFICATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JoinFetch_MissingIdentificationVariable", "Ljava/lang/String;", null, "JOIN_FETCH_MISSING_IDENTIFICATION_VARIABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JoinFetch_MissingJoinAssociationPath", "Ljava/lang/String;", null, "JOIN_FETCH_MISSING_JOIN_ASSOCIATION_PATH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JoinFetch_WrongClauseDeclaration", "Ljava/lang/String;", null, "JOIN_FETCH_WRONG_CLAUSE_DECLARATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPQLExpression_InvalidQuery", "Ljava/lang/String;", null, "JPQL_EXPRESSION_INVALID_QUERY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JPQLExpression_UnknownEnding", "Ljava/lang/String;", null, "JPQL_EXPRESSION_UNKNOWN_ENDING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KeyExpression_InvalidExpression", "Ljava/lang/String;", null, "KEY_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KeyExpression_InvalidJPAVersion", "Ljava/lang/String;", null, "KEY_EXPRESSION_INVALID_JPA_VERSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KeyExpression_MissingExpression", "Ljava/lang/String;", null, "KEY_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KeyExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "KEY_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KeyExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "KEY_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LengthExpression_InvalidExpression", "Ljava/lang/String;", null, "LENGTH_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LengthExpression_MissingExpression", "Ljava/lang/String;", null, "LENGTH_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LengthExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "LENGTH_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LengthExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "LENGTH_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LengthExpression_WrongType", "Ljava/lang/String;", null, "LENGTH_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LikeExpression_InvalidEscapeCharacter", "Ljava/lang/String;", null, "LIKE_EXPRESSION_INVALID_ESCAPE_CHARACTER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LikeExpression_MissingEscapeCharacter", "Ljava/lang/String;", null, "LIKE_EXPRESSION_MISSING_ESCAPE_CHARACTER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LikeExpression_MissingPatternValue", "Ljava/lang/String;", null, "LIKE_EXPRESSION_MISSING_PATTERN_VALUE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LikeExpression_MissingStringExpression", "Ljava/lang/String;", null, "LIKE_EXPRESSION_MISSING_STRING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LocateExpression_FirstExpression_WrongType", "Ljava/lang/String;", null, "LOCATE_EXPRESSION_FIRST_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LocateExpression_InvalidFirstExpression", "Ljava/lang/String;", null, "LOCATE_EXPRESSION_INVALID_FIRST_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LocateExpression_InvalidSecondExpression", "Ljava/lang/String;", null, "LOCATE_EXPRESSION_INVALID_SECOND_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LocateExpression_InvalidThirdExpression", "Ljava/lang/String;", null, "LOCATE_EXPRESSION_INVALID_THIRD_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LocateExpression_MissingFirstComma", "Ljava/lang/String;", null, "LOCATE_EXPRESSION_MISSING_FIRST_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LocateExpression_MissingFirstExpression", "Ljava/lang/String;", null, "LOCATE_EXPRESSION_MISSING_FIRST_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LocateExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "LOCATE_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LocateExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "LOCATE_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LocateExpression_MissingSecondComma", "Ljava/lang/String;", null, "LOCATE_EXPRESSION_MISSING_SECOND_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LocateExpression_MissingSecondExpression", "Ljava/lang/String;", null, "LOCATE_EXPRESSION_MISSING_SECOND_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LocateExpression_MissingThirdExpression", "Ljava/lang/String;", null, "LOCATE_EXPRESSION_MISSING_THIRD_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LocateExpression_SecondExpression_WrongType", "Ljava/lang/String;", null, "LOCATE_EXPRESSION_SECOND_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LocateExpression_ThirdExpression_WrongType", "Ljava/lang/String;", null, "LOCATE_EXPRESSION_THIRD_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LogicalExpression_InvalidLeftExpression", "Ljava/lang/String;", null, "LOGICAL_EXPRESSION_INVALID_LEFT_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LogicalExpression_InvalidRightExpression", "Ljava/lang/String;", null, "LOGICAL_EXPRESSION_INVALID_RIGHT_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LogicalExpression_MissingLeftExpression", "Ljava/lang/String;", null, "LOGICAL_EXPRESSION_MISSING_LEFT_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LogicalExpression_MissingRightExpression", "Ljava/lang/String;", null, "LOGICAL_EXPRESSION_MISSING_RIGHT_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LowerExpression_InvalidExpression", "Ljava/lang/String;", null, "LOWER_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LowerExpression_MissingExpression", "Ljava/lang/String;", null, "LOWER_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LowerExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "LOWER_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LowerExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "LOWER_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LowerExpression_WrongType", "Ljava/lang/String;", null, "LOWER_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MaxFunction_InvalidExpression", "Ljava/lang/String;", null, "MAX_FUNCTION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MaxFunction_MissingExpression", "Ljava/lang/String;", null, "MAX_FUNCTION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MaxFunction_MissingLeftParenthesis", "Ljava/lang/String;", null, "MAX_FUNCTION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MaxFunction_MissingRightParenthesis", "Ljava/lang/String;", null, "MAX_FUNCTION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MinFunction_InvalidExpression", "Ljava/lang/String;", null, "MIN_FUNCTION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MinFunction_MissingExpression", "Ljava/lang/String;", null, "MIN_FUNCTION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MinFunction_MissingLeftParenthesis", "Ljava/lang/String;", null, "MIN_FUNCTION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MinFunction_MissingRightParenthesis", "Ljava/lang/String;", null, "MIN_FUNCTION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ModExpression_FirstExpression_WrongType", "Ljava/lang/String;", null, "MOD_EXPRESSION_FIRST_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ModExpression_InvalidFirstExpression", "Ljava/lang/String;", null, "MOD_EXPRESSION_INVALID_FIRST_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ModExpression_InvalidSecondExpression", "Ljava/lang/String;", null, "MOD_EXPRESSION_INVALID_SECOND_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ModExpression_MissingComma", "Ljava/lang/String;", null, "MOD_EXPRESSION_MISSING_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ModExpression_MissingFirstExpression", "Ljava/lang/String;", null, "MOD_EXPRESSION_MISSING_FIRST_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ModExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "MOD_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ModExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "MOD_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ModExpression_MissingSecondExpression", "Ljava/lang/String;", null, "MOD_EXPRESSION_MISSING_SECOND_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ModExpression_SecondExpression_WrongType", "Ljava/lang/String;", null, "MOD_EXPRESSION_SECOND_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MultiplicationExpression_LeftExpression_WrongType", "Ljava/lang/String;", null, "MULTIPLICATION_EXPRESSION_LEFT_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MultiplicationExpression_RightExpression_WrongType", "Ljava/lang/String;", null, "MULTIPLICATION_EXPRESSION_RIGHT_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NotExpression_MissingExpression", "Ljava/lang/String;", null, "NOT_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NotExpression_WrongType", "Ljava/lang/String;", null, "NOT_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NullComparisonExpression_InvalidType", "Ljava/lang/String;", null, "NULL_COMPARISON_EXPRESSION_INVALID_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NullComparisonExpression_MissingExpression", "Ljava/lang/String;", null, "NULL_COMPARISON_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NullIfExpression_InvalidFirstExpression", "Ljava/lang/String;", null, "NULLIF_EXPRESSION_INVALID_FIRST_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NullIfExpression_InvalidJPAVersion", "Ljava/lang/String;", null, "NULLIF_EXPRESSION_INVALID_JPA_VERSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NullIfExpression_InvalidSecondExpression", "Ljava/lang/String;", null, "NULLIF_EXPRESSION_INVALID_SECOND_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NullIfExpression_MissingComma", "Ljava/lang/String;", null, "NULLIF_EXPRESSION_MISSING_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NullIfExpression_MissingFirstExpression", "Ljava/lang/String;", null, "NULLIF_EXPRESSION_MISSING_FIRST_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NullIfExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "NULLIF_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NullIfExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "NULLIF_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NullIfExpression_MissingSecondExpression", "Ljava/lang/String;", null, "NULLIF_EXPRESSION_MISSING_SECOND_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NumericLiteral_Invalid", "Ljava/lang/String;", null, "NUMERIC_LITERAL_INVALID");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ObjectExpression_InvalidExpression", "Ljava/lang/String;", null, "OBJECT_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ObjectExpression_MissingExpression", "Ljava/lang/String;", null, "OBJECT_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ObjectExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "OBJECT_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ObjectExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "OBJECT_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OnClause_InvalidConditionalExpression", "Ljava/lang/String;", null, "ON_CLAUSE_INVALID_CONDITIONAL_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OnClause_MissingConditionalExpression", "Ljava/lang/String;", null, "ON_CLAUSE_MISSING_CONDITIONAL_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OrderByClause_OrderByItemEndsWithComma", "Ljava/lang/String;", null, "ORDER_BY_CLAUSE_ORDER_BY_ITEM_ENDS_WITH_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OrderByClause_OrderByItemIsMissingComma", "Ljava/lang/String;", null, "ORDER_BY_CLAUSE_ORDER_BY_ITEM_IS_MISSING_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OrderByClause_OrderByItemMissing", "Ljava/lang/String;", null, "ORDER_BY_CLAUSE_ORDER_BY_ITEM_MISSING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OrderByItem_InvalidExpression", "Ljava/lang/String;", null, "ORDER_BY_ITEM_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OrderByItem_MissingExpression", "Ljava/lang/String;", null, "ORDER_BY_ITEM_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PathExpression_NotRelationshipMapping", "Ljava/lang/String;", null, "PATH_EXPRESSION_NOT_RELATIONSHIP_MAPPING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RangeVariableDeclaration_InvalidRootObject", "Ljava/lang/String;", null, "RANGE_VARIABLE_DECLARATION_INVALID_ROOT_OBJECT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RangeVariableDeclaration_MissingIdentificationVariable", "Ljava/lang/String;", null, "RANGE_VARIABLE_DECLARATION_MISSING_IDENTIFICATION_VARIABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RangeVariableDeclaration_MissingRootObject", "Ljava/lang/String;", null, "RANGE_VARIABLE_DECLARATION_MISSING_ROOT_OBJECT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RegexpExpression_InvalidJPAVersion", "Ljava/lang/String;", null, "REGEXP_EXPRESSION_INVALID_JPA_VERSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RegexpExpression_InvalidPatternValue", "Ljava/lang/String;", null, "REGEXP_EXPRESSION_INVALID_PATTERN_VALUE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RegexpExpression_InvalidStringExpression", "Ljava/lang/String;", null, "REGEXP_EXPRESSION_INVALID_STRING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RegexpExpression_MissingPatternValue", "Ljava/lang/String;", null, "REGEXP_EXPRESSION_MISSING_PATTERN_VALUE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RegexpExpression_MissingStringExpression", "Ljava/lang/String;", null, "REGEXP_EXPRESSION_MISSING_STRING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ResultVariable_InvalidJPAVersion", "Ljava/lang/String;", null, "RESULT_VARIABLE_INVALID_JPA_VERSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ResultVariable_MissingResultVariable", "Ljava/lang/String;", null, "RESULT_VARIABLE_MISSING_RESULT_VARIABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ResultVariable_MissingSelectExpression", "Ljava/lang/String;", null, "RESULT_VARIABLE_MISSING_SELECT_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SimpleSelectClause_NotSingleExpression", "Ljava/lang/String;", null, "SIMPLE_SELECT_CLAUSE_NOT_SINGLE_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SizeExpression_InvalidExpression", "Ljava/lang/String;", null, "SIZE_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SizeExpression_MissingExpression", "Ljava/lang/String;", null, "SIZE_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SizeExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "SIZE_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SizeExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "SIZE_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SqrtExpression_InvalidExpression", "Ljava/lang/String;", null, "SQRT_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SqrtExpression_MissingExpression", "Ljava/lang/String;", null, "SQRT_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SqrtExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "SQRT_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SqrtExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "SQRT_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SqrtExpression_WrongType", "Ljava/lang/String;", null, "SQRT_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "StateFieldPathExpression_AssociationField", "Ljava/lang/String;", null, "STATE_FIELD_PATH_EXPRESSION_ASSOCIATION_FIELD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "StateFieldPathExpression_BasicField", "Ljava/lang/String;", null, "STATE_FIELD_PATH_EXPRESSION_BASIC_FIELD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "StateFieldPathExpression_CollectionType", "Ljava/lang/String;", null, "STATE_FIELD_PATH_EXPRESSION_COLLECTION_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "StateFieldPathExpression_InvalidEnumConstant", "Ljava/lang/String;", null, "STATE_FIELD_PATH_EXPRESSION_INVALID_ENUM_CONSTANT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "StateFieldPathExpression_NoMapping", "Ljava/lang/String;", null, "STATE_FIELD_PATH_EXPRESSION_NO_MAPPING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "StateFieldPathExpression_NotResolvable", "Ljava/lang/String;", null, "STATE_FIELD_PATH_EXPRESSION_NOT_RESOLVABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "StateFieldPathExpression_UnknownColumn", "Ljava/lang/String;", null, "STATE_FIELD_PATH_EXPRESSION_UNKNOWN_COLUMN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "StringLiteral_MissingClosingQuote", "Ljava/lang/String;", null, "STRING_LITERAL_MISSING_CLOSING_QUOTE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SubExpression_MissingExpression", "Ljava/lang/String;", null, "SUB_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SubExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "SUB_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SubstringExpression_FirstExpression_WrongType", "Ljava/lang/String;", null, "SUBSTRING_EXPRESSION_FIRST_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SubstringExpression_InvalidFirstExpression", "Ljava/lang/String;", null, "SUBSTRING_EXPRESSION_INVALID_FIRST_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SubstringExpression_InvalidSecondExpression", "Ljava/lang/String;", null, "SUBSTRING_EXPRESSION_INVALID_SECOND_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SubstringExpression_InvalidThirdExpression", "Ljava/lang/String;", null, "SUBSTRING_EXPRESSION_INVALID_THIRD_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SubstringExpression_MissingFirstComma", "Ljava/lang/String;", null, "SUBSTRING_EXPRESSION_MISSING_FIRST_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SubstringExpression_MissingFirstExpression", "Ljava/lang/String;", null, "SUBSTRING_EXPRESSION_MISSING_FIRST_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SubstringExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "SUBSTRING_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SubstringExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "SUBSTRING_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SubstringExpression_MissingSecondComma", "Ljava/lang/String;", null, "SUBSTRING_EXPRESSION_MISSING_SECOND_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SubstringExpression_MissingSecondExpression", "Ljava/lang/String;", null, "SUBSTRING_EXPRESSION_MISSING_SECOND_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SubstringExpression_MissingThirdExpression", "Ljava/lang/String;", null, "SUBSTRING_EXPRESSION_MISSING_THIRD_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SubstringExpression_SecondExpression_WrongType", "Ljava/lang/String;", null, "SUBSTRING_EXPRESSION_SECOND_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SubstringExpression_ThirdExpression_WrongType", "Ljava/lang/String;", null, "SUBSTRING_EXPRESSION_THIRD_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SubtractionExpression_LeftExpression_WrongType", "Ljava/lang/String;", null, "SUBTRACTION_EXPRESSION_LEFT_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SubtractionExpression_RightExpression_WrongType", "Ljava/lang/String;", null, "SUBTRACTION_EXPRESSION_RIGHT_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SumFunction_InvalidExpression", "Ljava/lang/String;", null, "SUM_FUNCTION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SumFunction_MissingExpression", "Ljava/lang/String;", null, "SUM_FUNCTION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SumFunction_MissingLeftParenthesis", "Ljava/lang/String;", null, "SUM_FUNCTION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SumFunction_MissingRightParenthesis", "Ljava/lang/String;", null, "SUM_FUNCTION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SumFunction_WrongType", "Ljava/lang/String;", null, "SUM_FUNCTION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TableExpression_InvalidExpression", "Ljava/lang/String;", null, "TABLE_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TableExpression_InvalidTableName", "Ljava/lang/String;", null, "TABLE_EXPRESSION_INVALID_TABLE_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TableExpression_MissingExpression", "Ljava/lang/String;", null, "TABLE_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TableExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "TABLE_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TableExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "TABLE_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TableVariableDeclaration_InvalidJPAVersion", "Ljava/lang/String;", null, "TABLE_VARIABLE_DECLARATION_INVALID_JPA_VERSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TableVariableDeclaration_MissingIdentificationVariable", "Ljava/lang/String;", null, "TABLE_VARIABLE_DECLARATION_MISSING_IDENTIFICATION_VARIABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TreatExpression_InvalidJPAPlatform", "Ljava/lang/String;", null, "TREAT_EXPRESSION_INVALID_JPA_PLATFORM");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TrimExpression_InvalidExpression", "Ljava/lang/String;", null, "TRIM_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TrimExpression_InvalidTrimCharacter", "Ljava/lang/String;", null, "TRIM_EXPRESSION_INVALID_TRIM_CHARACTER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TrimExpression_MissingExpression", "Ljava/lang/String;", null, "TRIM_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TrimExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "TRIM_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TrimExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "TRIM_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TrimExpression_NotSingleStringLiteral", "Ljava/lang/String;", null, "TRIM_EXPRESSION_NOT_SINGLE_STRING_LITERAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TypeExpression_InvalidExpression", "Ljava/lang/String;", null, "TYPE_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TypeExpression_InvalidJPAVersion", "Ljava/lang/String;", null, "TYPE_EXPRESSION_INVALID_JPA_VERSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TypeExpression_MissingExpression", "Ljava/lang/String;", null, "TYPE_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TypeExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "TYPE_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TypeExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "TYPE_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UnionClause_InvalidJPAVersion", "Ljava/lang/String;", null, "UNION_CLAUSE_INVALID_JPA_VERSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UnionClause_MissingExpression", "Ljava/lang/String;", null, "UNION_CLAUSE_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UpdateClause_MissingRangeVariableDeclaration", "Ljava/lang/String;", null, "UPDATE_CLAUSE_MISSING_RANGE_VARIABLE_DECLARATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UpdateClause_MissingSet", "Ljava/lang/String;", null, "UPDATE_CLAUSE_MISSING_SET");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UpdateClause_MissingUpdateItems", "Ljava/lang/String;", null, "UPDATE_CLAUSE_MISSING_UPDATE_ITEMS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UpdateClause_UpdateItemEndsWithComma", "Ljava/lang/String;", null, "UPDATE_CLAUSE_UPDATE_ITEM_ENDS_WITH_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UpdateClause_UpdateItemIsMissingComma", "Ljava/lang/String;", null, "UPDATE_CLAUSE_UPDATE_ITEM_IS_MISSING_COMMA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UpdateItem_MissingEqualSign", "Ljava/lang/String;", null, "UPDATE_ITEM_MISSING_EQUAL_SIGN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UpdateItem_MissingNewValue", "Ljava/lang/String;", null, "UPDATE_ITEM_MISSING_NEW_VALUE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UpdateItem_MissingStateFieldPathExpression", "Ljava/lang/String;", null, "UPDATE_ITEM_MISSING_STATE_FIELD_PATH_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UpdateItem_NotAssignable", "Ljava/lang/String;", null, "UPDATE_ITEM_NOT_ASSIGNABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UpdateItem_NotResolvable", "Ljava/lang/String;", null, "UPDATE_ITEM_NOT_RESOLVABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UpdateItem_NullNotAssignableToPrimitive", "Ljava/lang/String;", null, "UPDATE_ITEM_NULL_NOT_ASSIGNABLE_TO_PRIMITIVE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UpdateItem_RelationshipPathExpression", "Ljava/lang/String;", null, "UPDATE_ITEM_RELATIONSHIP_PATH_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UpperExpression_InvalidExpression", "Ljava/lang/String;", null, "UPPER_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UpperExpression_MissingExpression", "Ljava/lang/String;", null, "UPPER_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UpperExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "UPPER_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UpperExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "UPPER_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UpperExpression_WrongType", "Ljava/lang/String;", null, "UPPER_EXPRESSION_WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ValueExpression_InvalidExpression", "Ljava/lang/String;", null, "VALUE_EXPRESSION_INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ValueExpression_InvalidJPAVersion", "Ljava/lang/String;", null, "VALUE_EXPRESSION_INVALID_JPA_VERSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ValueExpression_MissingExpression", "Ljava/lang/String;", null, "VALUE_EXPRESSION_MISSING_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ValueExpression_MissingLeftParenthesis", "Ljava/lang/String;", null, "VALUE_EXPRESSION_MISSING_LEFT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ValueExpression_MissingRightParenthesis", "Ljava/lang/String;", null, "VALUE_EXPRESSION_MISSING_RIGHT_PARENTHESIS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WhenClause_MissingThenExpression", "Ljava/lang/String;", null, "WHEN_CLAUSE_MISSING_THEN_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WhenClause_MissingThenIdentifier", "Ljava/lang/String;", null, "WHEN_CLAUSE_MISSING_THEN_IDENTIFIER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WhenClause_MissingWhenExpression", "Ljava/lang/String;", null, "WHEN_CLAUSE_MISSING_WHEN_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WhereClause_InvalidConditionalExpression", "Ljava/lang/String;", null, "WHERE_CLAUSE_INVALID_CONDITIONAL_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WhereClause_MissingConditionalExpression", "Ljava/lang/String;", null, "WHERE_CLAUSE_MISSING_CONDITIONAL_EXPRESSION");
fieldVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
