package asm.org.apache.cxf.feature;
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
public class DelegatingFeatureDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/feature/DelegatingFeature", "<T::Lorg/apache/cxf/feature/AbstractPortableFeature;>Lorg/apache/cxf/feature/AbstractFeature;", "org/apache/cxf/feature/AbstractFeature", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "delegate", "Lorg/apache/cxf/feature/AbstractPortableFeature;", "TT;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/cxf/feature/AbstractPortableFeature;)V", "(TT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/feature/AbstractFeature", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/feature/DelegatingFeature", "getDelegate", "()Lorg/apache/cxf/feature/AbstractPortableFeature;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/cxf/feature/DelegatingFeature", "org/apache/cxf/feature/AbstractPortableFeature"}, 1, new Object[] {"org/apache/cxf/feature/DelegatingFeature"});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/cxf/feature/DelegatingFeature", "org/apache/cxf/feature/AbstractPortableFeature"}, 2, new Object[] {"org/apache/cxf/feature/DelegatingFeature", "org/apache/cxf/feature/AbstractPortableFeature"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/feature/DelegatingFeature", "delegate", "Lorg/apache/cxf/feature/AbstractPortableFeature;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getDelegate", "()Lorg/apache/cxf/feature/AbstractPortableFeature;", "()TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/feature/DelegatingFeature", "delegate", "Lorg/apache/cxf/feature/AbstractPortableFeature;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDelegate", "(Lorg/apache/cxf/feature/AbstractPortableFeature;)V", "(TT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/feature/DelegatingFeature", "delegate", "Lorg/apache/cxf/feature/AbstractPortableFeature;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(Lorg/apache/cxf/endpoint/Server;Lorg/apache/cxf/Bus;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/feature/DelegatingFeature", "delegate", "Lorg/apache/cxf/feature/AbstractPortableFeature;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/feature/AbstractPortableFeature", "initialize", "(Lorg/apache/cxf/endpoint/Server;Lorg/apache/cxf/Bus;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(Lorg/apache/cxf/endpoint/Client;Lorg/apache/cxf/Bus;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/feature/DelegatingFeature", "delegate", "Lorg/apache/cxf/feature/AbstractPortableFeature;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/feature/AbstractPortableFeature", "initialize", "(Lorg/apache/cxf/endpoint/Client;Lorg/apache/cxf/Bus;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(Lorg/apache/cxf/interceptor/InterceptorProvider;Lorg/apache/cxf/Bus;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/feature/DelegatingFeature", "delegate", "Lorg/apache/cxf/feature/AbstractPortableFeature;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/feature/AbstractPortableFeature", "initialize", "(Lorg/apache/cxf/interceptor/InterceptorProvider;Lorg/apache/cxf/Bus;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(Lorg/apache/cxf/Bus;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/feature/DelegatingFeature", "delegate", "Lorg/apache/cxf/feature/AbstractPortableFeature;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/feature/AbstractPortableFeature", "initialize", "(Lorg/apache/cxf/Bus;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initializeProvider", "(Lorg/apache/cxf/interceptor/InterceptorProvider;Lorg/apache/cxf/Bus;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/feature/DelegatingFeature", "delegate", "Lorg/apache/cxf/feature/AbstractPortableFeature;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/feature/AbstractPortableFeature", "doInitializeProvider", "(Lorg/apache/cxf/interceptor/InterceptorProvider;Lorg/apache/cxf/Bus;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
