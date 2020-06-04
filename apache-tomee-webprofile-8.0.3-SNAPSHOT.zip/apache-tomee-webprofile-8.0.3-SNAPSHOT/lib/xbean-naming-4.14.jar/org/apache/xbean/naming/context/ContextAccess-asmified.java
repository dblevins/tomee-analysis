package asm.org.apache.xbean.naming.context;
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
public class ContextAccessDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/xbean/naming/context/ContextAccess", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/xbean/naming/context/ContextAccess$2", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/xbean/naming/context/ContextAccess$1", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MODIFIABLE", "Lorg/apache/xbean/naming/context/ContextAccess;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNMODIFIABLE", "Lorg/apache/xbean/naming/context/ContextAccess;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isModifiable", "(Ljavax/naming/Name;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/naming/context/ContextAccess$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/naming/context/ContextAccess$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/naming/context/ContextAccess", "MODIFIABLE", "Lorg/apache/xbean/naming/context/ContextAccess;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/naming/context/ContextAccess$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/naming/context/ContextAccess$2", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/naming/context/ContextAccess", "UNMODIFIABLE", "Lorg/apache/xbean/naming/context/ContextAccess;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
