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
public class XMLPlatformDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/eclipse/persistence/oxm/platform/XMLPlatform", "<XML_UNMARSHALLER:Lorg/eclipse/persistence/internal/oxm/XMLUnmarshaller;>Lorg/eclipse/persistence/internal/databaseaccess/DatasourcePlatform;Lorg/eclipse/persistence/internal/oxm/record/XMLPlatform<TXML_UNMARSHALLER;>;", "org/eclipse/persistence/internal/databaseaccess/DatasourcePlatform", new String[] { "org/eclipse/persistence/internal/oxm/record/XMLPlatform" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/DatasourcePlatform", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConversionManager", "()Lorg/eclipse/persistence/internal/helper/ConversionManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/platform/XMLPlatform", "conversionManager", "Lorg/eclipse/persistence/internal/helper/ConversionManager;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/oxm/XMLConversionManager", "getDefaultXMLManager", "()Lorg/eclipse/persistence/internal/oxm/XMLConversionManager;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLConversionManager", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/oxm/XMLConversionManager");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/platform/XMLPlatform", "conversionManager", "Lorg/eclipse/persistence/internal/helper/ConversionManager;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/platform/XMLPlatform", "conversionManager", "Lorg/eclipse/persistence/internal/helper/ConversionManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newPlatformUnmarshaller", "(Lorg/eclipse/persistence/internal/oxm/XMLUnmarshaller;)Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;", "(TXML_UNMARSHALLER;)Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newPlatformUnmarshaller", "(Lorg/eclipse/persistence/internal/oxm/XMLUnmarshaller;Ljava/util/Map;)Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;", "(TXML_UNMARSHALLER;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Boolean;>;)Lorg/eclipse/persistence/internal/oxm/record/PlatformUnmarshaller;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
