package asm.org.eclipse.persistence.internal.jpa.jpql;
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
public class HermesParserDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", null, "java/lang/Object", new String[] { "org/eclipse/persistence/queries/JPAQueryBuilder" });

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/jpql/HermesParser$DatabaseQueryVisitor", "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "DatabaseQueryVisitor", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/queries/DatabaseQuery$ParameterType", "org/eclipse/persistence/queries/DatabaseQuery", "ParameterType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "validationLevel", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("EclipseLink");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "validationLevel", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "addArguments", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;Lorg/eclipse/persistence/queries/DatabaseQuery;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "inputParameters", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "inputParameters", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/internal/jpa/jpql/HermesParser", "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "org/eclipse/persistence/queries/DatabaseQuery", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/expressions/ParameterExpression");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/ParameterExpression", "getField", "()Lorg/eclipse/persistence/internal/helper/DatabaseField;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseField", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/expressions/ParameterExpression", "getType", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/parser/InputParameter");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/InputParameter", "isPositional", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/queries/DatabaseQuery$ParameterType", "POSITIONAL", "Lorg/eclipse/persistence/queries/DatabaseQuery$ParameterType;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/persistence/internal/jpa/jpql/HermesParser", "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "org/eclipse/persistence/queries/DatabaseQuery", "java/util/Map$Entry", "java/util/Iterator", "org/eclipse/persistence/internal/expressions/ParameterExpression"}, 3, new Object[] {"org/eclipse/persistence/queries/DatabaseQuery", "java/lang/String", "java/lang/Class"});
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/queries/DatabaseQuery$ParameterType", "NAMED", "Lorg/eclipse/persistence/queries/DatabaseQuery$ParameterType;");
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/persistence/internal/jpa/jpql/HermesParser", "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "org/eclipse/persistence/queries/DatabaseQuery", "java/util/Map$Entry", "java/util/Iterator", "org/eclipse/persistence/internal/expressions/ParameterExpression"}, 4, new Object[] {"org/eclipse/persistence/queries/DatabaseQuery", "java/lang/String", "java/lang/Class", "org/eclipse/persistence/queries/DatabaseQuery$ParameterType"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/DatabaseQuery", "addArgument", "(Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/queries/DatabaseQuery$ParameterType;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/internal/jpa/jpql/HermesParser", "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "org/eclipse/persistence/queries/DatabaseQuery", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/persistence/internal/jpa/jpql/HermesParser", "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "org/eclipse/persistence/queries/DatabaseQuery"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "buildException", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;Ljava/util/Collection;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/JPQLException;", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;Ljava/util/Collection<Lorg/eclipse/persistence/jpa/jpql/JPQLQueryProblem;>;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/JPQLException;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NullPointerException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "resourceBundle", "()Ljava/util/ResourceBundle;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/eclipse/persistence/internal/jpa/jpql/HermesParser", "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "java/util/Collection", "java/lang/String", "java/util/ResourceBundle", "java/lang/StringBuilder", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/JPQLQueryProblem");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/JPQLQueryProblem", "getMessageKey", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ResourceBundle", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/eclipse/persistence/internal/jpa/jpql/HermesParser", "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "java/util/Collection", "java/lang/String", "java/util/ResourceBundle", "java/lang/StringBuilder", "org/eclipse/persistence/jpa/jpql/JPQLQueryProblem", "java/util/Iterator"}, 1, new Object[] {"java/lang/NullPointerException"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/JPQLQueryProblem", "getMessageKey", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/JPQLQueryProblem", "getMessageArguments", "()[Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFLE, label6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/text/MessageFormat", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Ljava/lang/String;"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("\n");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("[");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/JPQLQueryProblem", "getStartPosition", "()I", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn(", ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/JPQLQueryProblem", "getEndPosition", "()I", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("] ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/eclipse/persistence/internal/jpa/jpql/HermesParser", "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "java/util/Collection", "java/lang/String", "java/util/ResourceBundle", "java/lang/StringBuilder", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ResourceBundle", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "getJPQLQuery", "()Ljava/lang/CharSequence;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/text/MessageFormat", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/JPQLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/JPQLException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildQuery", "(Ljava/lang/CharSequence;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/queries/DatabaseQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "populateQueryImp", "(Ljava/lang/CharSequence;Lorg/eclipse/persistence/queries/DatabaseQuery;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/queries/DatabaseQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildSelectionCriteria", "(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/expressions/Expression;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/eclipse/persistence/exceptions/JPQLException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/JPQLExpression");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jpa/jpql/parser/DefaultEclipseLinkJPQLGrammar", "instance", "()Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;", false);
methodVisitor.visitLdcInsn("conditional_expression");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "isTolerant", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/JPQLExpression", "<init>", "(Ljava/lang/CharSequence;Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;Ljava/lang/String;Z)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "jpqlGrammar", "()Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "cache", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;Lorg/eclipse/persistence/queries/DatabaseQuery;Lorg/eclipse/persistence/jpa/jpql/parser/JPQLExpression;Ljava/lang/CharSequence;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("this");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "addRangeVariableDeclaration", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/JPQLExpression", "getQueryStatement", "()Lorg/eclipse/persistence/jpa/jpql/parser/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "validate", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;Lorg/eclipse/persistence/jpa/jpql/parser/Expression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/JPQLExpression", "getQueryStatement", "()Lorg/eclipse/persistence/jpa/jpql/parser/Expression;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "buildExpression", "(Lorg/eclipse/persistence/jpa/jpql/parser/Expression;)Lorg/eclipse/persistence/expressions/Expression;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/eclipse/persistence/exceptions/JPQLException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "buildUnexpectedException", "(Ljava/lang/CharSequence;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/JPQLException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "buildUnexpectedException", "(Ljava/lang/CharSequence;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/JPQLException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "resourceBundle", "()Ljava/util/ResourceBundle;", false);
methodVisitor.visitLdcInsn("HERMES_PARSER_UNEXPECTED_EXCEPTION_ERROR_MESSAGE");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ResourceBundle", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/text/MessageFormat", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/JPQLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/JPQLException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "isTolerant", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "validationLevel", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("None");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "jpqlGrammar", "()Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "validationLevel", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("EclipseLink");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jpa/jpql/parser/DefaultEclipseLinkJPQLGrammar", "instance", "()Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "validationLevel", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("JPA 1.0");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jpa/jpql/parser/JPQLGrammar1_0", "instance", "()Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "validationLevel", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("JPA 2.0");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jpa/jpql/parser/JPQLGrammar2_0", "instance", "()Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "validationLevel", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("JPA 2.1");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jpa/jpql/parser/JPQLGrammar2_1", "instance", "()Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jpa/jpql/parser/DefaultEclipseLinkJPQLGrammar", "instance", "()Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "populateQuery", "(Ljava/lang/CharSequence;Lorg/eclipse/persistence/queries/DatabaseQuery;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "populateQueryImp", "(Ljava/lang/CharSequence;Lorg/eclipse/persistence/queries/DatabaseQuery;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/queries/DatabaseQuery;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "populateQueryImp", "(Ljava/lang/CharSequence;Lorg/eclipse/persistence/queries/DatabaseQuery;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/queries/DatabaseQuery;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/eclipse/persistence/exceptions/JPQLException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/JPQLExpression");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jpa/jpql/parser/DefaultEclipseLinkJPQLGrammar", "instance", "()Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "isTolerant", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/JPQLExpression", "<init>", "(Ljava/lang/CharSequence;Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;Z)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "jpqlGrammar", "()Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "cache", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;Lorg/eclipse/persistence/queries/DatabaseQuery;Lorg/eclipse/persistence/jpa/jpql/parser/JPQLExpression;Ljava/lang/CharSequence;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "validate", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;Lorg/eclipse/persistence/jpa/jpql/parser/Expression;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/jpql/HermesParser$DatabaseQueryVisitor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/HermesParser$DatabaseQueryVisitor", "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;Ljava/lang/CharSequence;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/JPQLExpression", "accept", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionVisitor;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "getDatabaseQuery", "()Lorg/eclipse/persistence/queries/DatabaseQuery;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "addArguments", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;Lorg/eclipse/persistence/queries/DatabaseQuery;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/eclipse/persistence/jpa/jpql/parser/JPQLExpression", "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext", "org/eclipse/persistence/internal/jpa/jpql/HermesParser$DatabaseQueryVisitor"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/eclipse/persistence/internal/jpa/jpql/HermesParser", "java/lang/CharSequence", "org/eclipse/persistence/queries/DatabaseQuery", "org/eclipse/persistence/internal/sessions/AbstractSession"}, 1, new Object[] {"org/eclipse/persistence/exceptions/JPQLException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "buildUnexpectedException", "(Ljava/lang/CharSequence;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/JPQLException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "resourceBundle", "()Ljava/util/ResourceBundle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/jpa/jpql/JPQLQueryProblemResourceBundle;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/ResourceBundle", "getBundle", "(Ljava/lang/String;)Ljava/util/ResourceBundle;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValidationLevel", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "validationLevel", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "validate", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;Lorg/eclipse/persistence/jpa/jpql/parser/Expression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "validationLevel", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("None");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/EclipseLinkGrammarValidator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "jpqlGrammar", "()Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/EclipseLinkGrammarValidator", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/parser/JPQLGrammar;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/EclipseLinkGrammarValidator", "setProblems", "(Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/parser/Expression", "accept", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionVisitor;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "isEmpty", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("HERMES_PARSER_GRAMMAR_VALIDATOR_ERROR_MESSAGE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "buildException", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;Ljava/util/Collection;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/JPQLException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Collection", "org/eclipse/persistence/jpa/jpql/EclipseLinkGrammarValidator"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/jpql/EclipseLinkSemanticValidator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/EclipseLinkSemanticValidator", "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/EclipseLinkSemanticValidator", "setProblems", "(Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/parser/Expression", "accept", "(Lorg/eclipse/persistence/jpa/jpql/parser/ExpressionVisitor;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "isEmpty", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("HERMES_PARSER_SEMANTIC_VALIDATOR_ERROR_MESSAGE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/HermesParser", "buildException", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;Ljava/util/Collection;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/JPQLException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}