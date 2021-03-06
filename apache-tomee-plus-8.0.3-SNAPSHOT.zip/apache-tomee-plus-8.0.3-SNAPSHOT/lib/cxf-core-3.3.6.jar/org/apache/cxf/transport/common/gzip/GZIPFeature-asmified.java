package asm.org.apache.cxf.transport.common.gzip;
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
public class GZIPFeatureDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/transport/common/gzip/GZIPFeature", "Lorg/apache/cxf/feature/DelegatingFeature<Lorg/apache/cxf/transport/common/gzip/GZIPFeature$Portable;>;", "org/apache/cxf/feature/DelegatingFeature", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/cxf/common/injection/NoJSR250Annotations;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/cxf/annotations/Provider;", true);
annotationVisitor0.visitEnum("value", "Lorg/apache/cxf/annotations/Provider$Type;", "Feature");
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/cxf/transport/common/gzip/GZIPFeature$Portable", "org/apache/cxf/transport/common/gzip/GZIPFeature", "Portable", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/annotations/Provider$Type", "org/apache/cxf/annotations/Provider", "Type", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/common/gzip/GZIPFeature$Portable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/common/gzip/GZIPFeature$Portable", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/feature/DelegatingFeature", "<init>", "(Lorg/apache/cxf/feature/AbstractPortableFeature;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(Ljava/util/List;)V", "(Ljava/util/List<Lorg/apache/cxf/interceptor/Interceptor<+Lorg/apache/cxf/message/Message;>;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/common/gzip/GZIPFeature", "delegate", "Lorg/apache/cxf/feature/AbstractPortableFeature;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/transport/common/gzip/GZIPFeature$Portable");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/transport/common/gzip/GZIPFeature$Portable", "access$000", "(Lorg/apache/cxf/transport/common/gzip/GZIPFeature$Portable;Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setThreshold", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/common/gzip/GZIPFeature", "delegate", "Lorg/apache/cxf/feature/AbstractPortableFeature;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/transport/common/gzip/GZIPFeature$Portable");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/common/gzip/GZIPFeature$Portable", "setThreshold", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getThreshold", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/common/gzip/GZIPFeature", "delegate", "Lorg/apache/cxf/feature/AbstractPortableFeature;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/transport/common/gzip/GZIPFeature$Portable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/common/gzip/GZIPFeature$Portable", "getThreshold", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setForce", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/common/gzip/GZIPFeature", "delegate", "Lorg/apache/cxf/feature/AbstractPortableFeature;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/transport/common/gzip/GZIPFeature$Portable");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/common/gzip/GZIPFeature$Portable", "setForce", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getForce", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/common/gzip/GZIPFeature", "delegate", "Lorg/apache/cxf/feature/AbstractPortableFeature;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/transport/common/gzip/GZIPFeature$Portable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/common/gzip/GZIPFeature$Portable", "getForce", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
