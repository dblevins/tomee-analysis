package asm.com.sun.xml.bind.v2.model.impl;
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
public class RuntimeEnumConstantImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER, "com/sun/xml/bind/v2/model/impl/RuntimeEnumConstantImpl", "Lcom/sun/xml/bind/v2/model/impl/EnumConstantImpl<Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;>;", "com/sun/xml/bind/v2/model/impl/EnumConstantImpl", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/bind/v2/model/impl/RuntimeEnumLeafInfoImpl;Ljava/lang/String;Ljava/lang/String;Lcom/sun/xml/bind/v2/model/impl/EnumConstantImpl;)V", "(Lcom/sun/xml/bind/v2/model/impl/RuntimeEnumLeafInfoImpl;Ljava/lang/String;Ljava/lang/String;Lcom/sun/xml/bind/v2/model/impl/EnumConstantImpl<Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/EnumConstantImpl", "<init>", "(Lcom/sun/xml/bind/v2/model/impl/EnumLeafInfoImpl;Ljava/lang/String;Ljava/lang/String;Lcom/sun/xml/bind/v2/model/impl/EnumConstantImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
