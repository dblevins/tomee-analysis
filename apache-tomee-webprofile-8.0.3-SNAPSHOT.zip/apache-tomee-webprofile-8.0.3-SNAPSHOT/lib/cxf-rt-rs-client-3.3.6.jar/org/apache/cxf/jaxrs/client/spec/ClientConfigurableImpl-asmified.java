package asm.org.apache.cxf.jaxrs.client.spec;
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
public class ClientConfigurableImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl", "<C::Ljakarta/ws/rs/core/Configurable<TC;>;>Lorg/apache/cxf/jaxrs/impl/ConfigurableImpl<TC;>;", "org/apache/cxf/jaxrs/impl/ConfigurableImpl", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/ws/rs/core/Configurable;)V", "(TC;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/spec/ClientConfigurableImpl", "<init>", "(Ljakarta/ws/rs/core/Configurable;Ljakarta/ws/rs/core/Configuration;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/ws/rs/core/Configurable;Ljakarta/ws/rs/core/Configuration;)V", "(TC;Ljakarta/ws/rs/core/Configuration;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/impl/ConfigurationImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/RuntimeType", "CLIENT", "Ljakarta/ws/rs/RuntimeType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/impl/ConfigurationImpl", "<init>", "(Ljakarta/ws/rs/RuntimeType;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {Opcodes.UNINITIALIZED_THIS, "jakarta/ws/rs/core/Configurable", "jakarta/ws/rs/core/Configuration"}, 2, new Object[] {Opcodes.UNINITIALIZED_THIS, "jakarta/ws/rs/core/Configurable"});
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/impl/ConfigurationImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/impl/ConfigurationImpl", "<init>", "(Ljakarta/ws/rs/core/Configuration;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {Opcodes.UNINITIALIZED_THIS, "jakarta/ws/rs/core/Configurable", "jakarta/ws/rs/core/Configuration"}, 3, new Object[] {Opcodes.UNINITIALIZED_THIS, "jakarta/ws/rs/core/Configurable", "jakarta/ws/rs/core/Configuration"});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/impl/ConfigurableImpl", "<init>", "(Ljakarta/ws/rs/core/Configurable;Ljakarta/ws/rs/core/Configuration;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
