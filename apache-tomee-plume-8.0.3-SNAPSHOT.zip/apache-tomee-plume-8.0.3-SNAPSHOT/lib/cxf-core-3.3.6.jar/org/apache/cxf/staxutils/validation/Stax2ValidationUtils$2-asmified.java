package asm.org.apache.cxf.staxutils.validation;
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
public class Stax2ValidationUtils$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/staxutils/validation/Stax2ValidationUtils$2", null, "java/lang/Object", new String[] { "org/codehaus/stax2/validation/ValidationProblemHandler" });

classWriter.visitOuterClass("org/apache/cxf/staxutils/validation/Stax2ValidationUtils", "setupValidation", "(Ljavax/xml/stream/XMLStreamWriter;Lorg/apache/cxf/endpoint/Endpoint;Lorg/apache/cxf/service/model/ServiceInfo;)Z");

classWriter.visitInnerClass("org/apache/cxf/staxutils/validation/Stax2ValidationUtils$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/staxutils/validation/Stax2ValidationUtils;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/staxutils/validation/Stax2ValidationUtils;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/staxutils/validation/Stax2ValidationUtils$2", "this$0", "Lorg/apache/cxf/staxutils/validation/Stax2ValidationUtils;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reportProblem", "(Lorg/codehaus/stax2/validation/XMLValidationProblem;)V", null, new String[] { "org/codehaus/stax2/validation/XMLValidationException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/interceptor/Fault");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/validation/XMLValidationProblem", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/staxutils/validation/Stax2ValidationUtils", "access$000", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/Fault", "<init>", "(Ljava/lang/String;Ljava/util/logging/Logger;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
