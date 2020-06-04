package asm.org.apache.geronimo.microprofile.openapi.impl.processor;
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
public class AnnotationProcessor$SchemaWithRefDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/geronimo/microprofile/openapi/impl/processor/AnnotationProcessor$SchemaWithRef", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/processor/AnnotationProcessor$SchemaWithRef", "org/apache/geronimo/microprofile/openapi/impl/processor/AnnotationProcessor", "SchemaWithRef", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/processor/AnnotationProcessor$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "ref", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "schema", "Lorg/eclipse/microprofile/openapi/models/media/Schema;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/media/Schema;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/openapi/impl/processor/AnnotationProcessor$SchemaWithRef", "ref", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/openapi/impl/processor/AnnotationProcessor$SchemaWithRef", "schema", "Lorg/eclipse/microprofile/openapi/models/media/Schema;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/geronimo/microprofile/openapi/impl/processor/AnnotationProcessor$SchemaWithRef;)Lorg/eclipse/microprofile/openapi/models/media/Schema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/openapi/impl/processor/AnnotationProcessor$SchemaWithRef", "schema", "Lorg/eclipse/microprofile/openapi/models/media/Schema;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/geronimo/microprofile/openapi/impl/processor/AnnotationProcessor$SchemaWithRef;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/openapi/impl/processor/AnnotationProcessor$SchemaWithRef", "ref", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/media/Schema;Lorg/apache/geronimo/microprofile/openapi/impl/processor/AnnotationProcessor$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/openapi/impl/processor/AnnotationProcessor$SchemaWithRef", "<init>", "(Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/media/Schema;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
