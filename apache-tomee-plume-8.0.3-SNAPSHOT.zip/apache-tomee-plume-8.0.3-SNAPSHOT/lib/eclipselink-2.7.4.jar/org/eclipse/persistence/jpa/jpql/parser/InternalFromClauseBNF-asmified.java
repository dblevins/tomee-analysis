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
public class InternalFromClauseBNFDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/jpa/jpql/parser/InternalFromClauseBNF", null, "org/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ID", "Ljava/lang/String;", null, "internal_from_clause");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("internal_from_clause");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initialize", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF", "initialize", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/InternalFromClauseBNF", "setHandleAggregate", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/InternalFromClauseBNF", "setHandleCollection", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("identification_variable_declaration");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/InternalFromClauseBNF", "setFallbackBNFId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("collection_member_declaration");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/InternalFromClauseBNF", "registerExpressionFactory", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("identification_variable_declaration");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/InternalFromClauseBNF", "registerChild", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
