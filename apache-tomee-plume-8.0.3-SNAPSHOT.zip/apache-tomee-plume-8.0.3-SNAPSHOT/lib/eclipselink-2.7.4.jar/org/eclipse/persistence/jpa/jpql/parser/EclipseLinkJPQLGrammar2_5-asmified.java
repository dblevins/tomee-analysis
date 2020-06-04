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
public class EclipseLinkJPQLGrammar2_5Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", null, "org/eclipse/persistence/jpa/jpql/parser/AbstractJPQLGrammar", null);

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
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "INSTANCE", "Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/EclipseLinkVersion", "VERSION_2_5", "Lorg/eclipse/persistence/jpa/jpql/EclipseLinkVersion;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "VERSION", "Lorg/eclipse/persistence/jpa/jpql/EclipseLinkVersion;");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractJPQLGrammar;)V", null, null);
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
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/AbstractJPQLGrammar;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "instance", "()Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "INSTANCE", "Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "buildBaseGrammar", "()Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_4", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "VERSION", "Lorg/eclipse/persistence/jpa/jpql/EclipseLinkVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/EclipseLinkVersion", "getVersion", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initializeBNFs", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/AsOfClauseBNF");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/AsOfClauseBNF", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerBNF", "(Lorg/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/ConnectByClauseBNF");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/ConnectByClauseBNF", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerBNF", "(Lorg/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/HierarchicalQueryClauseBNF");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/HierarchicalQueryClauseBNF", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerBNF", "(Lorg/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/InternalConnectByClauseBNF");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/InternalConnectByClauseBNF", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerBNF", "(Lorg/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/OrderSiblingsByClauseBNF");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/OrderSiblingsByClauseBNF", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerBNF", "(Lorg/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/StartWithClauseBNF");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/StartWithClauseBNF", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerBNF", "(Lorg/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("in_expression_expression");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "setHandleNestedArray", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("in_expression_item");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "setHandleNestedArray", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("in_expression_expression");
methodVisitor.visitLdcInsn("scalar_expression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "addChildBNF", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initializeExpressionFactories", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/AsOfClauseFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/AsOfClauseFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerFactory", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/ConnectByClauseFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/ConnectByClauseFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerFactory", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/HierarchicalQueryClauseFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/HierarchicalQueryClauseFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerFactory", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/OrderSiblingsByClauseFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/OrderSiblingsByClauseFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerFactory", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/StartWithClauseFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/StartWithClauseFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerFactory", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionFactory;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initializeIdentifiers", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("select-statement");
methodVisitor.visitLdcInsn("FROM");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "addIdentifier", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("AS OF");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "CLAUSE", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("CONNECT BY");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "CLAUSE", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("SCN");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "COMPLEMENT", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("START WITH");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "CLAUSE", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ORDER SIBLINGS BY");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "CLAUSE", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("TIMESTAMP");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/IdentifierRole", "COMPLEMENT", "Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerIdentifierRole", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/parser/IdentifierRole;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("CONNECT BY");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ORDER SIBLINGS BY");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("SCN");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("START WITH");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("SIBLINGS");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("START");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("WITH");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/JPAVersion", "VERSION_2_1", "Lorg/eclipse/persistence/jpa/jpql/JPAVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/EclipseLinkJPQLGrammar2_5", "registerIdentifierVersion", "(Ljava/lang/String;Lorg/eclipse/persistence/jpa/jpql/JPAVersion;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("EclipseLink 2.5");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
