package asm.com.sun.faces.util.cdi11;
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
public class CDIUtilImpl$BeanWrapper$DefaultAnnotationLiteralDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/util/cdi11/CDIUtilImpl$BeanWrapper$DefaultAnnotationLiteral", "Ljakarta/enterprise/util/AnnotationLiteral<Ljakarta/enterprise/inject/Default;>;", "jakarta/enterprise/util/AnnotationLiteral", null);

classWriter.visitInnerClass("com/sun/faces/util/cdi11/CDIUtilImpl$BeanWrapper", "com/sun/faces/util/cdi11/CDIUtilImpl", "BeanWrapper", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/util/cdi11/CDIUtilImpl$BeanWrapper$DefaultAnnotationLiteral", "com/sun/faces/util/cdi11/CDIUtilImpl$BeanWrapper", "DefaultAnnotationLiteral", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-9065007202240742004L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/util/AnnotationLiteral", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
