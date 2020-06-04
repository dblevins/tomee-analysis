package asm.org.eclipse.persistence.internal.core.sessions;
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
public class CoreAbstractSessionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/eclipse/persistence/internal/core/sessions/CoreAbstractSession", "<DESCRIPTOR:Lorg/eclipse/persistence/core/descriptors/CoreDescriptor;LOGIN::Lorg/eclipse/persistence/core/sessions/CoreLogin;PLATFORM::Lorg/eclipse/persistence/internal/core/databaseaccess/CorePlatform;PROJECT:Lorg/eclipse/persistence/core/sessions/CoreProject;SESSION_EVENT_MANAGER:Lorg/eclipse/persistence/core/sessions/CoreSessionEventManager;>Ljava/lang/Object;Lorg/eclipse/persistence/core/sessions/CoreSession<TDESCRIPTOR;TLOGIN;TPLATFORM;TPROJECT;TSESSION_EVENT_MANAGER;>;", "java/lang/Object", new String[] { "org/eclipse/persistence/core/sessions/CoreSession" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDatasourcePlatform", "()Lorg/eclipse/persistence/internal/core/databaseaccess/CorePlatform;", "()TPLATFORM;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDescriptors", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/Class;TDESCRIPTOR;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPlatform", "(Ljava/lang/Class;)Lorg/eclipse/persistence/internal/core/databaseaccess/CorePlatform;", "(Ljava/lang/Class;)TPLATFORM;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
