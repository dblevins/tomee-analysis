package asm.com.ctc.wstx.api;
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
public class EmptyElementHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "com/ctc/wstx/api/EmptyElementHandler", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", "com/ctc/wstx/api/EmptyElementHandler", "HtmlEmptyElementHandler", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/ctc/wstx/api/EmptyElementHandler$SetEmptyElementHandler", "com/ctc/wstx/api/EmptyElementHandler", "SetEmptyElementHandler", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "allowEmptyElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
