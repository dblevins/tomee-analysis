package asm.org.eclipse.persistence.sdo.helper.jaxb;
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
public class JAXBDataFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/sdo/helper/jaxb/JAXBDataFactory", null, "org/eclipse/persistence/sdo/helper/delegates/SDODataFactoryDelegate", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcommonj/sdo/helper/HelperContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDODataFactoryDelegate", "<init>", "(Lcommonj/sdo/helper/HelperContext;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHelperContext", "()Lorg/eclipse/persistence/sdo/helper/jaxb/JAXBHelperContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDODataFactoryDelegate", "getHelperContext", "()Lcommonj/sdo/helper/HelperContext;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/helper/jaxb/JAXBHelperContext");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "create", "(Lcommonj/sdo/Type;)Lcommonj/sdo/DataObject;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDODataFactoryDelegate", "create", "(Lcommonj/sdo/Type;)Lcommonj/sdo/DataObject;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDODataFactoryDelegate", "create", "(Lcommonj/sdo/Type;)Lcommonj/sdo/DataObject;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/SDODataObject");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/jaxb/JAXBValueStore");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/jaxb/JAXBDataFactory", "getHelperContext", "()Lorg/eclipse/persistence/sdo/helper/jaxb/JAXBHelperContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/SDOType");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/jaxb/JAXBValueStore", "<init>", "(Lorg/eclipse/persistence/sdo/helper/jaxb/JAXBHelperContext;Lorg/eclipse/persistence/sdo/SDOType;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/jaxb/JAXBValueStore", "initialize", "(Lcommonj/sdo/DataObject;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDODataObject", "_setCurrentValueStore", "(Lorg/eclipse/persistence/sdo/ValueStore;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/jaxb/JAXBDataFactory", "getHelperContext", "()Lorg/eclipse/persistence/sdo/helper/jaxb/JAXBHelperContext;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/jaxb/JAXBValueStore", "getEntity", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/jaxb/JAXBHelperContext", "putWrapperDataObject", "(Ljava/lang/Object;Lorg/eclipse/persistence/sdo/SDODataObject;)V", false);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/persistence/sdo/helper/jaxb/JAXBDataFactory", "commonj/sdo/Type", "org/eclipse/persistence/sdo/SDODataObject"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDODataFactoryDelegate", "create", "(Lcommonj/sdo/Type;)Lcommonj/sdo/DataObject;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getHelperContext", "()Lcommonj/sdo/helper/HelperContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/jaxb/JAXBDataFactory", "getHelperContext", "()Lorg/eclipse/persistence/sdo/helper/jaxb/JAXBHelperContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
