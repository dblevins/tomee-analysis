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
public class InternalWhenClauseBNFDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/jpa/jpql/parser/InternalWhenClauseBNF", null, "org/eclipse/persistence/jpa/jpql/parser/JPQLQueryBNF", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ID", "Ljava/lang/String;", null, "internal_when_clause*");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("internal_when_clause*");
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
methodVisitor.visitLdcInsn("entity_type_expression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/InternalWhenClauseBNF", "setFallbackBNFId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("conditional_expression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/InternalWhenClauseBNF", "registerChild", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("scalar_expression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/InternalWhenClauseBNF", "registerChild", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
