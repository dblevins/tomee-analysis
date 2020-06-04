package asm.org.eclipse.persistence.internal.libraries.asm.xml;
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
public class Processor$SAXWriterFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/internal/libraries/asm/xml/Processor$SAXWriterFactory", null, "java/lang/Object", new String[] { "org/eclipse/persistence/internal/libraries/asm/xml/Processor$ContentHandlerFactory" });

classWriter.visitInnerClass("org/eclipse/persistence/internal/libraries/asm/xml/Processor$SAXWriterFactory", "org/eclipse/persistence/internal/libraries/asm/xml/Processor", "SAXWriterFactory", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/libraries/asm/xml/Processor$SAXWriter", "org/eclipse/persistence/internal/libraries/asm/xml/Processor", "SAXWriter", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/libraries/asm/xml/Processor$ContentHandlerFactory", "org/eclipse/persistence/internal/libraries/asm/xml/Processor", "ContentHandlerFactory", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "w", "Ljava/io/Writer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "optimizeEmptyElements", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/io/Writer;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/asm/xml/Processor$SAXWriterFactory", "w", "Ljava/io/Writer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/asm/xml/Processor$SAXWriterFactory", "optimizeEmptyElements", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "createContentHandler", "()Lorg/xml/sax/ContentHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/xml/Processor$SAXWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/xml/Processor$SAXWriterFactory", "w", "Ljava/io/Writer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/xml/Processor$SAXWriterFactory", "optimizeEmptyElements", "Z");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/xml/Processor$SAXWriter", "<init>", "(Ljava/io/Writer;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
