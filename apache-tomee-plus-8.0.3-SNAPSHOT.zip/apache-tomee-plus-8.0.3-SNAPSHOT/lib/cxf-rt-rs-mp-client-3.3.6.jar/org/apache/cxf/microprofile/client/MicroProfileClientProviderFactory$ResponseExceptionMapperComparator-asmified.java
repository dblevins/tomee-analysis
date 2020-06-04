package asm.org.apache.cxf.microprofile.client;
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
public class MicroProfileClientProviderFactory$ResponseExceptionMapperComparatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory$ResponseExceptionMapperComparator", "Ljava/lang/Object;Ljava/util/Comparator<Lorg/eclipse/microprofile/rest/client/ext/ResponseExceptionMapper<*>;>;", "java/lang/Object", new String[] { "java/util/Comparator" });

classWriter.visitInnerClass("org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory$ResponseExceptionMapperComparator", "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "ResponseExceptionMapperComparator", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/microprofile/client/MicroProfileClientProviderFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/cxf/microprofile/client/MicroProfileClientProviderFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory$ResponseExceptionMapperComparator", "this$0", "Lorg/apache/cxf/microprofile/client/MicroProfileClientProviderFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compare", "(Lorg/eclipse/microprofile/rest/client/ext/ResponseExceptionMapper;Lorg/eclipse/microprofile/rest/client/ext/ResponseExceptionMapper;)I", "(Lorg/eclipse/microprofile/rest/client/ext/ResponseExceptionMapper<*>;Lorg/eclipse/microprofile/rest/client/ext/ResponseExceptionMapper<*>;)I", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/rest/client/ext/ResponseExceptionMapper", "getPriority", "()I", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/rest/client/ext/ResponseExceptionMapper", "getPriority", "()I", true);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/rest/client/ext/ResponseExceptionMapper");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/rest/client/ext/ResponseExceptionMapper");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory$ResponseExceptionMapperComparator", "compare", "(Lorg/eclipse/microprofile/rest/client/ext/ResponseExceptionMapper;Lorg/eclipse/microprofile/rest/client/ext/ResponseExceptionMapper;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/cxf/microprofile/client/MicroProfileClientProviderFactory;Lorg/apache/cxf/microprofile/client/MicroProfileClientProviderFactory$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory$ResponseExceptionMapperComparator", "<init>", "(Lorg/apache/cxf/microprofile/client/MicroProfileClientProviderFactory;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
