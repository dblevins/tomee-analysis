package asm.org.eclipse.persistence.sdo;
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
public class SDODataGraphDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/sdo/SDODataGraph", null, "java/lang/Object", new String[] { "commonj/sdo/DataGraph" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "helperContext", "Lcommonj/sdo/helper/HelperContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "rootObject", "Lorg/eclipse/persistence/sdo/SDODataObject;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "changeSummary", "Lorg/eclipse/persistence/sdo/SDOChangeSummary;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcommonj/sdo/helper/HelperContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "commonj/sdo/impl/HelperProvider", "getDefaultContext", "()Lcommonj/sdo/helper/HelperContext;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "helperContext", "Lcommonj/sdo/helper/HelperContext;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/eclipse/persistence/sdo/SDODataGraph", "commonj/sdo/helper/HelperContext"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "helperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/SDOChangeSummary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/SDOChangeSummary", "<init>", "(Lorg/eclipse/persistence/sdo/SDODataGraph;Lcommonj/sdo/helper/HelperContext;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "changeSummary", "Lorg/eclipse/persistence/sdo/SDOChangeSummary;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRootObject", "()Lorg/eclipse/persistence/sdo/SDODataObject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "rootObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getChangeSummary", "()Lorg/eclipse/persistence/sdo/SDOChangeSummary;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "changeSummary", "Lorg/eclipse/persistence/sdo/SDOChangeSummary;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/persistence/sdo/SDOType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "helperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/HelperContext", "getTypeHelper", "()Lcommonj/sdo/helper/TypeHelper;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/TypeHelper", "getType", "(Ljava/lang/String;Ljava/lang/String;)Lcommonj/sdo/Type;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/SDOType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createRootObject", "(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/persistence/sdo/SDODataObject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "rootObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "helperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/HelperContext", "getDataFactory", "()Lcommonj/sdo/helper/DataFactory;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/DataFactory", "create", "(Ljava/lang/String;Ljava/lang/String;)Lcommonj/sdo/DataObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/SDODataObject");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "rootObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "rootObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDODataObject", "setDataGraph", "(Lcommonj/sdo/DataGraph;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "rootObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "changeSummary", "Lorg/eclipse/persistence/sdo/SDOChangeSummary;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDODataObject", "_setChangeSummary", "(Lorg/eclipse/persistence/sdo/SDOChangeSummary;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "changeSummary", "Lorg/eclipse/persistence/sdo/SDOChangeSummary;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "rootObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDOChangeSummary", "setRootDataObject", "(Lcommonj/sdo/DataObject;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "rootObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createRootObject", "(Lcommonj/sdo/Type;)Lorg/eclipse/persistence/sdo/SDODataObject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "rootObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "helperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/HelperContext", "getDataFactory", "()Lcommonj/sdo/helper/DataFactory;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/DataFactory", "create", "(Lcommonj/sdo/Type;)Lcommonj/sdo/DataObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/SDODataObject");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "rootObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "rootObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDODataObject", "setDataGraph", "(Lcommonj/sdo/DataGraph;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "rootObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "changeSummary", "Lorg/eclipse/persistence/sdo/SDOChangeSummary;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDODataObject", "_setChangeSummary", "(Lorg/eclipse/persistence/sdo/SDOChangeSummary;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "changeSummary", "Lorg/eclipse/persistence/sdo/SDOChangeSummary;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "rootObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDOChangeSummary", "setRootDataObject", "(Lcommonj/sdo/DataObject;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDODataGraph", "rootObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "createRootObject", "(Ljava/lang/String;Ljava/lang/String;)Lcommonj/sdo/DataObject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDODataGraph", "createRootObject", "(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/persistence/sdo/SDODataObject;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "createRootObject", "(Lcommonj/sdo/Type;)Lcommonj/sdo/DataObject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDODataGraph", "createRootObject", "(Lcommonj/sdo/Type;)Lorg/eclipse/persistence/sdo/SDODataObject;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getType", "(Ljava/lang/String;Ljava/lang/String;)Lcommonj/sdo/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDODataGraph", "getType", "(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/persistence/sdo/SDOType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getRootObject", "()Lcommonj/sdo/DataObject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDODataGraph", "getRootObject", "()Lorg/eclipse/persistence/sdo/SDODataObject;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getChangeSummary", "()Lcommonj/sdo/ChangeSummary;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDODataGraph", "getChangeSummary", "()Lorg/eclipse/persistence/sdo/SDOChangeSummary;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
