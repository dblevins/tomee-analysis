package asm.org.apache.openejb.server.cxf.rs;
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
public class CdiResourceProvider$PseudoScopedCdiBeanCreatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/server/cxf/rs/CdiResourceProvider$PseudoScopedCdiBeanCreator", null, "java/lang/Object", new String[] { "org/apache/openejb/server/cxf/rs/CdiResourceProvider$BeanCreator" });

classWriter.visitInnerClass("org/apache/openejb/server/cxf/rs/CdiResourceProvider$PseudoScopedCdiBeanCreator", "org/apache/openejb/server/cxf/rs/CdiResourceProvider", "PseudoScopedCdiBeanCreator", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/openejb/server/cxf/rs/CdiResourceProvider$BeanCreator", "org/apache/openejb/server/cxf/rs/CdiResourceProvider", "BeanCreator", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/ws/rs/core/Response$ResponseBuilder", "jakarta/ws/rs/core/Response", "ResponseBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "toClean", "Ljakarta/enterprise/context/spi/CreationalContext;", "Ljakarta/enterprise/context/spi/CreationalContext<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/server/cxf/rs/CdiResourceProvider;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/openejb/server/cxf/rs/CdiResourceProvider;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/rs/CdiResourceProvider$PseudoScopedCdiBeanCreator", "this$0", "Lorg/apache/openejb/server/cxf/rs/CdiResourceProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/rs/CdiResourceProvider$PseudoScopedCdiBeanCreator", "toClean", "Ljakarta/enterprise/context/spi/CreationalContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "create", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/enterprise/inject/InjectionException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CdiResourceProvider$PseudoScopedCdiBeanCreator", "this$0", "Lorg/apache/openejb/server/cxf/rs/CdiResourceProvider;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CdiResourceProvider", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CdiResourceProvider$PseudoScopedCdiBeanCreator", "this$0", "Lorg/apache/openejb/server/cxf/rs/CdiResourceProvider;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CdiResourceProvider", "bean", "Ljakarta/enterprise/inject/spi/Bean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "createCreationalContext", "(Ljakarta/enterprise/context/spi/Contextual;)Lorg/apache/webbeans/context/creational/CreationalContextImpl;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/rs/CdiResourceProvider$PseudoScopedCdiBeanCreator", "toClean", "Ljakarta/enterprise/context/spi/CreationalContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CdiResourceProvider$PseudoScopedCdiBeanCreator", "this$0", "Lorg/apache/openejb/server/cxf/rs/CdiResourceProvider;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CdiResourceProvider", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CdiResourceProvider$PseudoScopedCdiBeanCreator", "this$0", "Lorg/apache/openejb/server/cxf/rs/CdiResourceProvider;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CdiResourceProvider", "bean", "Ljakarta/enterprise/inject/spi/Bean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CdiResourceProvider$PseudoScopedCdiBeanCreator", "this$0", "Lorg/apache/openejb/server/cxf/rs/CdiResourceProvider;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CdiResourceProvider", "bean", "Ljakarta/enterprise/inject/spi/Bean;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/Bean", "getBeanClass", "()Ljava/lang/Class;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CdiResourceProvider$PseudoScopedCdiBeanCreator", "toClean", "Ljakarta/enterprise/context/spi/CreationalContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "getReference", "(Ljakarta/enterprise/inject/spi/Bean;Ljava/lang/reflect/Type;Ljakarta/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/enterprise/inject/InjectionException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Failed to instantiate: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CdiResourceProvider$PseudoScopedCdiBeanCreator", "this$0", "Lorg/apache/openejb/server/cxf/rs/CdiResourceProvider;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CdiResourceProvider", "bean", "Ljakarta/enterprise/inject/spi/Bean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_CDI", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Logger", "getInstance", "(Lorg/apache/openejb/util/LogCategory;Ljava/lang/Class;)Lorg/apache/openejb/util/Logger;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/WebApplicationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "serverError", "()Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "entity", "(Ljava/lang/Object;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/WebApplicationException", "<init>", "(Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "release", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/CdiResourceProvider$PseudoScopedCdiBeanCreator", "toClean", "Ljakarta/enterprise/context/spi/CreationalContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/context/spi/CreationalContext", "release", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/rs/CdiResourceProvider$PseudoScopedCdiBeanCreator", "toClean", "Ljakarta/enterprise/context/spi/CreationalContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
