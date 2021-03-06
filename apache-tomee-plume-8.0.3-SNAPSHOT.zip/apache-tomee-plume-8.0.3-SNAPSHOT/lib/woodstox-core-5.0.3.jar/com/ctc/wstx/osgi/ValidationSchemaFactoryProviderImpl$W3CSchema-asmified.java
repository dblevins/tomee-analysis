package asm.com.ctc.wstx.osgi;
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
public class ValidationSchemaFactoryProviderImpl$W3CSchemaDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_FINAL | ACC_SUPER, "com/ctc/wstx/osgi/ValidationSchemaFactoryProviderImpl$W3CSchema", null, "com/ctc/wstx/osgi/ValidationSchemaFactoryProviderImpl", null);

classWriter.visitInnerClass("com/ctc/wstx/osgi/ValidationSchemaFactoryProviderImpl$W3CSchema", "com/ctc/wstx/osgi/ValidationSchemaFactoryProviderImpl", "W3CSchema", ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/osgi/ValidationSchemaFactoryProviderImpl", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createValidationSchemaFactory", "()Lorg/codehaus/stax2/validation/XMLValidationSchemaFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/msv/W3CSchemaFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/msv/W3CSchemaFactory", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
