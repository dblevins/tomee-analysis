package asm.com.sun.xml.bind.v2.model.runtime;
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
public class RuntimeNonElementDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeNonElement", "Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/core/NonElement<Ljava/lang/reflect/Type;Ljava/lang/Class;>;Lcom/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo;", "java/lang/Object", new String[] { "com/sun/xml/bind/v2/model/core/NonElement", "com/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTransducer", "()Lcom/sun/xml/bind/v2/runtime/Transducer;", "<V:Ljava/lang/Object;>()Lcom/sun/xml/bind/v2/runtime/Transducer<TV;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
