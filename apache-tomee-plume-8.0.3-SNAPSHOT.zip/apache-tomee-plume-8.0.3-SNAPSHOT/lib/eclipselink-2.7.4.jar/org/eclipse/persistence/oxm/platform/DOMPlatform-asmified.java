package asm.org.eclipse.persistence.oxm.platform;
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
public class DOMPlatformDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/oxm/platform/DOMPlatform", "Lorg/eclipse/persistence/oxm/platform/XMLPlatform<Lorg/eclipse/persistence/oxm/XMLUnmarshaller;>;", "org/eclipse/persistence/oxm/platform/XMLPlatform", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/platform/XMLPlatform", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newPlatformUnmarshaller", "(Lorg/eclipse/persistence/oxm/XMLUnmarshaller;)Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/record/DOMUnmarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/record/DOMUnmarshaller", "<init>", "(Lorg/eclipse/persistence/oxm/XMLUnmarshaller;Ljava/util/Map;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newPlatformUnmarshaller", "(Lorg/eclipse/persistence/oxm/XMLUnmarshaller;Ljava/util/Map;)Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;", "(Lorg/eclipse/persistence/oxm/XMLUnmarshaller;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Boolean;>;)Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/record/DOMUnmarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/record/DOMUnmarshaller", "<init>", "(Lorg/eclipse/persistence/oxm/XMLUnmarshaller;Ljava/util/Map;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "newPlatformUnmarshaller", "(Lorg/eclipse/persistence/internal/oxm/XMLUnmarshaller;Ljava/util/Map;)Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/oxm/XMLUnmarshaller");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/platform/DOMPlatform", "newPlatformUnmarshaller", "(Lorg/eclipse/persistence/oxm/XMLUnmarshaller;Ljava/util/Map;)Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "newPlatformUnmarshaller", "(Lorg/eclipse/persistence/internal/oxm/XMLUnmarshaller;)Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/oxm/XMLUnmarshaller");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/platform/DOMPlatform", "newPlatformUnmarshaller", "(Lorg/eclipse/persistence/oxm/XMLUnmarshaller;)Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
