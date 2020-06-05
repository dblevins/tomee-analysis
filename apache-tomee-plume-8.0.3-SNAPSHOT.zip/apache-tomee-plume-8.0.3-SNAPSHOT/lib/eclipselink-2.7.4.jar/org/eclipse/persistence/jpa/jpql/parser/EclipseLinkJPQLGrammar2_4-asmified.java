package asm.org.eclipse.persistence.jpa.jpql.parser;
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
public class EclipseLinkJPQLGrammar2_4Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", null, "org/eclipse/persistence/jpa/jpql/parser/AbstractJPQLGrammar", null);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory$ParameterCount", "org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory", "ParameterCount", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "INSTANCE", "Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VERSION", "Lorg/eclipse/persistence/jpa/jpql/EclipseLinkVersion;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "INSTANCE", "Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/EclipseLinkVersion", "VERSION_2_4", "Lorg/eclipse/persistence/jpa/jpql/EclipseLinkVersion;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "VERSION", "Lorg/eclipse/persistence/jpa/jpql/EclipseLinkVersion;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractJPQLGrammar", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractJPQLGrammar;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractJPQLGrammar", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractJPQLGrammar;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "extend", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractJPQLGrammar;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractJPQLGrammar;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "instance", "()Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "INSTANCE", "Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "buildBaseGrammar", "()Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/JPQLGrammar2_1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/JPQLGrammar2_1", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_0", "extend", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractJPQLGrammar;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_1", "extend", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractJPQLGrammar;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJPAVersion", "()Lorg/eclipse/persistence/jpa/jpql/JPAVersion;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProvider", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("EclipseLink");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProviderVersion", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "VERSION", "Lorg/eclipse/persistence/jpa/jpql/EclipseLinkVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/EclipseLinkVersion", "getVersion", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initializeBNFs", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/CastExpressionBNF");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/CastExpressionBNF", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerBNF", "(Lorg/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/DatabaseTypeQueryBNF");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/DatabaseTypeQueryBNF", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerBNF", "(Lorg/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/ExtractExpressionBNF");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/ExtractExpressionBNF", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerBNF", "(Lorg/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/InternalColumnExpressionBNF");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/InternalColumnExpressionBNF", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerBNF", "(Lorg/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/RegexpExpressionBNF");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/RegexpExpressionBNF", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerBNF", "(Lorg/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/TableExpressionBNF");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/TableExpressionBNF", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerBNF", "(Lorg/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/TableVariableDeclarationBNF");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/TableVariableDeclarationBNF", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerBNF", "(Lorg/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/UnionClauseBNF");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/UnionClauseBNF", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerBNF", "(Lorg/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("join_association_path_expression*");
methodVisitor.visitLdcInsn("abstract_schema_name");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "addChildBNF", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/SimpleResultVariableBNF");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/SimpleResultVariableBNF", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerBNF", "(Lorg/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("simple_cond_expression");
methodVisitor.visitLdcInsn("function_expression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "addChildBNF", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("functions_returning_datetime");
methodVisitor.visitLdcInsn("cast_expression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "addChildBNF", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("functions_returning_numerics");
methodVisitor.visitLdcInsn("cast_expression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "addChildBNF", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("functions_returning_strings");
methodVisitor.visitLdcInsn("cast_expression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "addChildBNF", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("functions_returning_datetime");
methodVisitor.visitLdcInsn("extract_expression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "addChildBNF", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("functions_returning_numerics");
methodVisitor.visitLdcInsn("extract_expression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "addChildBNF", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("functions_returning_strings");
methodVisitor.visitLdcInsn("extract_expression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "addChildBNF", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("simple_cond_expression");
methodVisitor.visitLdcInsn("regexp_expression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "addChildBNF", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("range_declaration");
methodVisitor.visitLdcInsn("subquery");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "addChildBNF", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("internal_from_clause");
methodVisitor.visitLdcInsn("table_declaration");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "addChildBNF", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("internal_subquery_from_clause");
methodVisitor.visitLdcInsn("table_declaration");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "addChildBNF", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("internal_from_clause");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "setHandleSubExpression", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("internal_subquery_from_clause");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "setHandleSubExpression", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("identification_variable_declaration");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "setHandleSubExpression", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("range_variable_declaration");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "setHandleSubExpression", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initializeExpressionFactories", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/CastExpressionFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/CastExpressionFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerFactory", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/DatabaseTypeFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/DatabaseTypeFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerFactory", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/ExtractExpressionFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/ExtractExpressionFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerFactory", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/JoinCollectionValuedPathExpressionFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/JoinCollectionValuedPathExpressionFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerFactory", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/OnClauseFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/OnClauseFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerFactory", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/RegexpExpressionFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/RegexpExpressionFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerFactory", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/TableExpressionFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/TableExpressionFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerFactory", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/TableVariableDeclarationFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/TableVariableDeclarationFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerFactory", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/UnionClauseFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/UnionClauseFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerFactory", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionFactory;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COLUMN");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("COLUMN");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory", "<init>", "(Ljava/lang/String;[Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory$ParameterCount", "ONE", "Lorg/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory$ParameterCount;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory", "setParameterCount", "(Lorg/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory$ParameterCount;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("column_item");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/FunctionExpressionFactory", "setParameterQueryBNFId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerFactory", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("function_expression");
methodVisitor.visitLdcInsn("COLUMN");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "addChildFactory", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("join_association_path_expression*");
methodVisitor.visitLdcInsn("join_association_path_expression*");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "setFallbackExpressionFactoryId", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initializeIdentifiers", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("FUNCTION");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("FUNCTION");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("OPERATOR");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("SQL");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "addIdentifiers", "(Ljava/lang/String;[Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("CAST");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "FUNCTION", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("COLUMN");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "FUNCTION", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("EXCEPT");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "CLAUSE", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("EXTRACT");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "FUNCTION", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("FUNCTION");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "FUNCTION", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("INTERSECT");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "CLAUSE", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("NULLS FIRST");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "COMPLEMENT", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("NULLS LAST");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "COMPLEMENT", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ON");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "CLAUSE", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("OPERATOR");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "FUNCTION", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("REGEXP");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "COMPOUND_FUNCTION", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("SQL");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "FUNCTION", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("TABLE");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "FUNCTION", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("UNION");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "CLAUSE", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("CAST");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("COLUMN");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("EXCEPT");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("EXTRACT");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("FUNCTION");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("INTERSECT");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("NULLS FIRST");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("NULLS LAST");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ON");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("OPERATOR");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("REGEXP");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("SQL");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("TABLE");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("UNION");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("NULLS");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "CLAUSE", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("FIRST");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "CLAUSE", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("LAST");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "CLAUSE", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("EclipseLink 2.4");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}