package asm.org.apache.cxf.bus.blueprint;
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
public class BlueprintBusDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/bus/blueprint/BlueprintBus", null, "org/apache/cxf/bus/extension/ExtensionManagerBus", null);

classWriter.visitInnerClass("org/apache/cxf/bus/blueprint/BlueprintBus$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(0, "context", "Lorg/osgi/framework/BundleContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "container", "Lorg/osgi/service/blueprint/container/BlueprintContainer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/bus/blueprint/BlueprintBus;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/extension/ExtensionManagerBus", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBundleContext", "(Lorg/osgi/framework/BundleContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/blueprint/BlueprintBus", "context", "Lorg/osgi/framework/BundleContext;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/bus/blueprint/BlueprintBus$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/blueprint/BlueprintBus$1", "<init>", "(Lorg/apache/cxf/bus/blueprint/BlueprintBus;Lorg/osgi/framework/BundleContext;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/ClassLoader");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/ClassLoader;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/extension/ExtensionManagerBus", "setExtension", "(Ljava/lang/Object;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/resource/ResourceManager;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/extension/ExtensionManagerBus", "getExtension", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/resource/ResourceManager");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/resource/ClassLoaderResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/resource/ClassLoaderResolver", "<init>", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/resource/ResourceManager", "addResourceResolver", "(Lorg/apache/cxf/resource/ResourceResolver;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/osgi/framework/BundleContext;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/extension/ExtensionManagerBus", "setExtension", "(Ljava/lang/Object;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBlueprintContainer", "(Lorg/osgi/service/blueprint/container/BlueprintContainer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/blueprint/BlueprintBus", "container", "Lorg/osgi/service/blueprint/container/BlueprintContainer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/bus/blueprint/ConfigurerImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/blueprint/ConfigurerImpl", "<init>", "(Lorg/osgi/service/blueprint/container/BlueprintContainer;)V", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/configuration/Configurer;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/bus/blueprint/BlueprintBus", "setExtension", "(Ljava/lang/Object;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/bus/blueprint/BlueprintBeanLocator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/configuration/ConfiguredBeanLocator;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/bus/blueprint/BlueprintBus", "getExtension", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/configuration/ConfiguredBeanLocator");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/blueprint/BlueprintBus", "container", "Lorg/osgi/service/blueprint/container/BlueprintContainer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/blueprint/BlueprintBus", "context", "Lorg/osgi/framework/BundleContext;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/blueprint/BlueprintBeanLocator", "<init>", "(Lorg/apache/cxf/configuration/ConfiguredBeanLocator;Lorg/osgi/service/blueprint/container/BlueprintContainer;Lorg/osgi/framework/BundleContext;)V", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/configuration/ConfiguredBeanLocator;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/bus/blueprint/BlueprintBus", "setExtension", "(Ljava/lang/Object;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/blueprint/BlueprintBus", "id", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/blueprint/BlueprintBus", "context", "Lorg/osgi/framework/BundleContext;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/extension/ExtensionManagerBus", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/blueprint/BlueprintBus", "id", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/blueprint/BlueprintBus", "context", "Lorg/osgi/framework/BundleContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/osgi/framework/BundleContext", "getBundle", "()Lorg/osgi/framework/Bundle;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/osgi/framework/Bundle", "getSymbolicName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("-");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("cxf");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/blueprint/BlueprintBus", "id", "Ljava/lang/String;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/blueprint/BlueprintBus", "id", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
